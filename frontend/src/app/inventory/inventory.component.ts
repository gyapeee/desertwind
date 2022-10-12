import {Component, EventEmitter, Input, OnInit, Output} from '@angular/core';

import {JelenetDTO} from "../api/dtos";

@Component({
  selector: 'app-inventory',
  templateUrl: './inventory.component.html',
  styleUrls: ['./inventory.component.css'],
})
export class InventoryComponent implements OnInit {
  @Input() items: string[] = [];
  @Output() itemClicked: EventEmitter<string> = new EventEmitter<string>();
  constructor() {}

  ngOnInit(): void {
  }
}
