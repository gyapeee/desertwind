import { Component, OnInit } from '@angular/core';
import { CompassRoseService } from '../compass-rose/compass-rose.service';
import { StoryBoxService } from './story-box.service';
import { JelenetDTO } from '../api/dtos';

@Component({
  selector: 'app-story-box',
  templateUrl: './story-box.component.html',
  styleUrls: ['./story-box.component.css'],
})
export class StoryBoxComponent implements OnInit {
  sceneId: number = 2;
  story: JelenetDTO = {
                        "id": 0,
                        "szoveg": "",
                        "search": {
                          "szoveg": "",
                          "item": ""
                        },
                        "wait": {
                          "szoveg": "",
                          "dead": false,
                          "goToJelenet": 0
                        },
                        "invalidDirs": [
                          ""
                        ],
                        "invalidDirsText": "",
                        "validDirs": [
                          {
                            "name": "",
                            "goToJelenet": 0
                          }
                        ],
                        "visitedSzoveg": ""
                      };

  constructor(private storyBoxService: StoryBoxService, private compassRoseService: CompassRoseService) {}

  ngOnInit(): void {
    this.storyBoxService
      .story(this.sceneId)
      .subscribe((storyBoxText) =>
      {
        this.story = JSON.parse(storyBoxText);
        console.log(JSON.stringify(this.story));
      });

  this.compassRoseService.currentStory.subscribe((story)=> {
    console.log(story);
    if (story !== null){
     // this.story = JSON.parse(story);
    }
  });
 }
}
