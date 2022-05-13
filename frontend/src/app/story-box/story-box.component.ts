import { Component, OnInit } from '@angular/core';
import { StoryBoxService } from './story-box.service';

@Component({
  selector: 'app-story-box',
  templateUrl: './story-box.component.html',
  styleUrls: ['./story-box.component.css'],
})
export class StoryBoxComponent implements OnInit {
  constructor(private storyBoxService: StoryBoxService) {}

  ngOnInit(): void {
    this.storyBoxService
      .story()
      .subscribe((storyBoxText) => console.log(JSON.stringify(storyBoxText)));
  }
}
