import { Component, OnInit } from '@angular/core';
import { LocationBoxService } from './location-box.service';

@Component({
  selector: 'app-location-box',
  templateUrl: './location-box.component.html',
  styleUrls: ['./location-box.component.css'],
})
export class LocationBoxComponent implements OnInit {
  constructor(private locationBoxService: LocationBoxService) {}

  ngOnInit(): void {
//     this.locationBoxService
//       .location()
//       .subscribe((locationBoxText) =>
//         console.log(JSON.stringify(locationBoxText))
//       );
  }
}
