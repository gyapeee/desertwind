import { Component, OnInit } from '@angular/core';
import { CompassRoseService } from './compass-rose.service';
import { Direction } from '../api/direction';

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

    this.compassRoseService.compassRose(this.directionByName(buttonText)).subscribe((response) => {
      console.log(response);
    });
  }

  directionByName(name: string): number{
    switch(name){
      case Direction[1]:
        return Direction.Észak;
      case Direction[2]:
        return Direction.Dél;
      case Direction[3]:
        return Direction.Kelet;
      case Direction[4]:
        return Direction.Nyugat;
      default:
        return -1;
    }
  }
}



