import {Component, Input, OnInit} from '@angular/core';
import { LocationBoxService } from './location-box.service';
import {JelenetDTO} from "../api/dtos";

@Component({
  selector: 'app-location-box',
  templateUrl: './location-box.component.html',
  styleUrls: ['./location-box.component.css'],
})
export class LocationBoxComponent implements OnInit {
  @Input() story: JelenetDTO | null = null;

  constructor(private locationBoxService: LocationBoxService) {}

  ngOnInit(): void {
//     this.locationBoxService
//       .location()
//       .subscribe((locationBoxText) =>
//         console.log(JSON.stringify(locationBoxText))
//       );
  }
}
