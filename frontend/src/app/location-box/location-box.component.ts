import {Component, Input, OnInit} from '@angular/core';

@Component({
  selector: 'app-location-box',
  templateUrl: './location-box.component.html',
  styleUrls: ['./location-box.component.css'],
})
export class LocationBoxComponent implements OnInit {
  @Input() locationText: string | null = null;

  constructor() {}

  ngOnInit(): void {

  }
}
