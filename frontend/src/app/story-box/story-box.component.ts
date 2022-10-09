import {Component, Input, OnInit} from '@angular/core';
import { CompassRoseService } from '../compass-rose/compass-rose.service';
import { StoryBoxService } from './story-box.service';
import { JelenetDTO } from '../api/dtos';

@Component({
  selector: 'app-story-box',
  templateUrl: './story-box.component.html',
  styleUrls: ['./story-box.component.css'],
})
export class StoryBoxComponent implements OnInit {
  @Input() story: JelenetDTO | null = null;

  constructor(private storyBoxService: StoryBoxService, private compassRoseService: CompassRoseService) {}

  ngOnInit(): void {

  this.compassRoseService.currentStory.subscribe((story)=> {
    console.log(story);
    if (story !== null){
     // this.story = JSON.parse(story);
    }
  });
 }
}
