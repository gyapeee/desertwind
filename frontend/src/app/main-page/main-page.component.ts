import { Component, OnInit } from '@angular/core';
import {StoryBoxService} from "../story-box/story-box.service";
import {JelenetDTO} from "../api/dtos";

@Component({
  selector: 'app-main-page',
  templateUrl: './main-page.component.html',
  styleUrls: ['./main-page.component.css'],
})
export class MainPageComponent implements OnInit {
  title: string = 'DesertWind';
  constructor(private storyBoxService:StoryBoxService) {
  }

  sceneId: number = 2;
  story: JelenetDTO | null = null;
  direction: string = "";
  locationText: string = "";
  items: string[] = [];

  ngOnInit(): void {
    this.getStoryFromBackend();
  }

  onCompassRoseClicked(direction: string){
    // TODO remove this line after development
    console.log(direction);
    this.direction = direction;
    this.processDirectionChange();
  }

  onActionClicked(action: string){
    // TODO remove this line after development
    console.log(action);
    if ("Keresek" === action){
      this.updateInventory();
    }
  }

  private processDirectionChange() {
    if (this.story?.invalidDirs.includes(this.direction)){
      // print the invalidDirsText to location-box
      this.locationText = this.story?.invalidDirsText;
    } else {
      let newSceneID = this.getNewSceneID(this.direction);
      if (null == newSceneID){
        // direction cannot be processed
        throw new Error("Direction " + this.direction + " is not found in " +this.story?.validDirs);
      } else{
        this.sceneId = newSceneID;
        this.getStoryFromBackend();
      }
    }
  }

  private getStoryFromBackend() {
    this.storyBoxService
      .story(this.sceneId)
      .subscribe((storyBoxText) => {
        this.story = JSON.parse(storyBoxText);
        // TODO remove this line after development
        console.log(JSON.stringify(this.story));
      });
  }

  private getNewSceneID(direction: string): number | null{
    let newSceneId = null;
    this.story?.validDirs.forEach((validDirDTO) => {
      if (direction === validDirDTO.name){
        newSceneId = validDirDTO.goToJelenet;
      }
    })
    return newSceneId;
  }

  private updateInventory(): void{
    let newItem = this.story?.search.item;
    if (newItem && !this.items.includes(newItem)){
      this.items.push(newItem);
    }
  }
}
