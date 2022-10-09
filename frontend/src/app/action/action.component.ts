import {Component, Input, OnInit} from '@angular/core';
import { ActionService } from './action.service';
import {JelenetDTO} from "../api/dtos";

@Component({
  selector: 'app-action',
  templateUrl: './action.component.html',
  styleUrls: ['./action.component.css'],
})
export class ActionComponent implements OnInit {
  @Input() story: JelenetDTO | null = null;

  constructor(private actionService: ActionService) {}

  ngOnInit(): void {

  }

  onAction(event: any){
    let buttonText = event.currentTarget.innerText;
    this.actionService.action(buttonText).subscribe( response => {
      console.log(response);
    });
  }
}
