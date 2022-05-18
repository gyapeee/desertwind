import { Component, OnInit } from '@angular/core';
import { ActionUtil } from '../api/action';
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

  onAction(event: any){
    let buttonText = event.currentTarget.innerText;
    this.actionService.action(ActionUtil.actionByName(buttonText)).subscribe( response => {
      console.log(response);
    });
  }
}
