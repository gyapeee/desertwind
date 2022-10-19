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

  onItemClicked(event: any){
  // emit the text of the item
    this.itemClicked.emit(event.currentTarget.innerText);
  }
}
