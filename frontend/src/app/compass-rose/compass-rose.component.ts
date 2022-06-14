import { Component, OnInit } from '@angular/core';
import { CompassRoseService } from './compass-rose.service';
import { Szoveg } from '../api/Szoveg';

@Component({
  selector: 'app-compass-rose',
  templateUrl: './compass-rose.component.html',
  styleUrls: ['./compass-rose.component.css'],
})
export class CompassRoseComponent implements OnInit {
  constructor(private compassRoseService: CompassRoseService) {}

  ngOnInit(): void {}

  onMove(event: any) {
    let buttonText = event.currentTarget.innerText;

    this.compassRoseService.compassRose(buttonText).subscribe((response: Szoveg) => {
      console.log(response);
      this.compassRoseService.currentStory.next(response.szoveg);
    });
  }




}



