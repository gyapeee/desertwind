import { Component, OnInit } from '@angular/core';
import { CompassRoseService } from './compass-rose.service';
import { North } from '../api/directions';

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
    if (buttonText === North.direction.text)
      console.log("this is the direction value: " + North.direction.value);

    this.compassRoseService.compassRose('-1').subscribe((response) => {
      console.log(response);
    });
  }
}
