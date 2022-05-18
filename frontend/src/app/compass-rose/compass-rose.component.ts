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
    
    if (buttonText === Direction[1])
      console.log("this is the direction value: " + Direction.Észak);

    this.compassRoseService.compassRose('-1').subscribe((response) => {
      console.log(response);
    });
  }
}
