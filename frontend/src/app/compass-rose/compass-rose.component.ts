import { Component, OnInit } from '@angular/core';
import { CompassRoseService } from './compass-rose.service';
import { Direction, DirectionUtil } from '../api/direction';

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

    this.compassRoseService.compassRose(DirectionUtil.directionByName(buttonText)).subscribe((response) => {
      console.log(response);
    });
  }


}



