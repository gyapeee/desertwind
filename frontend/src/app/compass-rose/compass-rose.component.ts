import { Component, OnInit } from '@angular/core';
import { CompassRoseService } from './compass-rose.service';

@Component({
  selector: 'app-compass-rose',
  templateUrl: './compass-rose.component.html',
  styleUrls: ['./compass-rose.component.css'],
})
export class CompassRoseComponent implements OnInit {
  constructor(private compassRoseService: CompassRoseService) {}

  ngOnInit(): void {}

  onMove() {
    this.compassRoseService.compassRose('-1').subscribe((response) => {
      console.log(response);
    });
    console.log('compass rose is called');
  }
}
