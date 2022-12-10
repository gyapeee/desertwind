import {Component, EventEmitter, Input, OnInit, Output} from '@angular/core';
import { CompassRoseService } from './compass-rose.service';
import {JelenetDTO} from "../api/dtos";

@Component({
  selector: 'app-compass-rose',
  templateUrl: './compass-rose.component.html',
  styleUrls: ['./compass-rose.component.css'],
})
export class CompassRoseComponent implements OnInit {
  @Input() story: JelenetDTO | null = null;
  @Output() buttonClicked: EventEmitter<string> = new EventEmitter<string>();

  constructor(private compassRoseService: CompassRoseService) {}

  ngOnInit(): void {}

  onMove(event: any) {
    this.buttonClicked.emit(event.currentTarget.id);
  }




}



