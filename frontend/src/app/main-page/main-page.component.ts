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

  ngOnInit(): void {
    this.storyBoxService
      .story(this.sceneId)
      .subscribe((storyBoxText) => {
        this.story = JSON.parse(storyBoxText);
        console.log(JSON.stringify(this.story));
      });
  }
}
