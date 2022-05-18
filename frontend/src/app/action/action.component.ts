import { Component, OnInit } from '@angular/core';
import { ActionService } from './action.service';

@Component({
  selector: 'app-action',
  templateUrl: './action.component.html',
  styleUrls: ['./action.component.css'],
})
export class ActionComponent implements OnInit {
  constructor(private actionService: ActionService) {}

  ngOnInit(): void {

  }

  onAction(){
    this.actionService.action('69').subscribe( response => {
      console.log(response);
    });
  }
}
