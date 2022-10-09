import {Component, Input, OnInit} from '@angular/core';
import { InventoryService } from './inventory.service';
import {JelenetDTO} from "../api/dtos";

@Component({
  selector: 'app-inventory',
  templateUrl: './inventory.component.html',
  styleUrls: ['./inventory.component.css'],
})
export class InventoryComponent implements OnInit {
  @Input() story: JelenetDTO | null = null;
  items: string[] = [];
  constructor(private inventoryService: InventoryService) {}

  ngOnInit(): void {
    this.inventoryService
      .inventory()
      .subscribe((data) => console.log(JSON.stringify(data)));
  }
}
