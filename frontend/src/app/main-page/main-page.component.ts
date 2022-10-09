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

  ngOnInit(): void {
    this.getStoryFromBackend();
  }

  compassRoseClicked(direction: string){
    console.log(direction);
    this.direction = direction;
    this.processDirectionChange();
  }

  private processDirectionChange() {
    if (this.story?.invalidDirs.includes(this.direction)){
      // print the invalidDirsText to location-box
      this.locationText = this.story?.invalidDirsText;
    } else {
      let newSceneID = this.getnewSceneID(this.direction);
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
        console.log(JSON.stringify(this.story));
      });
  }

  private getnewSceneID(direction: string): number | null{
    let newSceneId = null;
    this.story?.validDirs.forEach((validDirDTO) => {
      if (direction === validDirDTO.name){
        newSceneId = validDirDTO.goToJelenet;
      }
    })
    return newSceneId;
  }
}
