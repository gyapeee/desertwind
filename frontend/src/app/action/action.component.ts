import {Component, EventEmitter, Input, OnInit, Output} from '@angular/core';
import {JelenetDTO} from "../api/dtos";

@Component({
  selector: 'app-action',
  templateUrl: './action.component.html',
  styleUrls: ['./action.component.css'],
})
export class ActionComponent implements OnInit {
  @Input() story: JelenetDTO | null = null;
  @Output() actionClicked: EventEmitter<string> = new EventEmitter<string>();

  constructor() {}

  ngOnInit(): void {

  }

  onAction(event: any){
    this.actionClicked.emit(event.currentTarget.innerText);
  }
}
