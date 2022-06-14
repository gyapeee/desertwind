import { Component, OnInit } from '@angular/core';
import { CompassRoseService } from '../compass-rose/compass-rose.service';
import { StoryBoxService } from './story-box.service';

@Component({
  selector: 'app-story-box',
  templateUrl: './story-box.component.html',
  styleUrls: ['./story-box.component.css'],
})
export class StoryBoxComponent implements OnInit {
  story: string =""; 
  
  constructor(private storyBoxService: StoryBoxService, private compassRoseService: CompassRoseService) {}

  ngOnInit(): void {
    this.storyBoxService
      .story()
      .subscribe((storyBoxText) => 
      {
        console.log(JSON.stringify(storyBoxText));
        this.story = storyBoxText;
      });

  this.compassRoseService.currentStory.subscribe((story)=> {
    console.log(story);
    if (story !== null){
      this.story = story;
    }  
  });
 }
}
