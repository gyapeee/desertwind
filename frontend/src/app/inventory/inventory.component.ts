import { Component, OnInit } from '@angular/core';
import {InventoryService} from "./inventory.service";

@Component({
  selector: 'app-inventory',
  templateUrl: './inventory.component.html',
  styleUrls: ['./inventory.component.css']
})
export class InventoryComponent implements OnInit {

  constructor(private inventoryService: InventoryService) { }

  ngOnInit(): void {
    this.inventoryService.inventory().subscribe(data => console.log(JSON.stringify(data)))
  }

}
