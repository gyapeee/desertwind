import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { MainPageComponent } from './main-page/main-page.component';
import { NgbModule } from '@ng-bootstrap/ng-bootstrap';
import { ActionComponent } from './action/action.component';
import { CompassRoseComponent } from './compass-rose/compass-rose.component';
import { StoryBoxComponent } from './story-box/story-box.component';
import { InventoryComponent } from './inventory/inventory.component';
import { LocationBoxComponent } from './location-box/location-box.component';
import {InventoryService} from "./inventory/inventory.service";
import {HttpClientModule} from "@angular/common/http";

@NgModule({
  declarations: [
    AppComponent,
    MainPageComponent,
    ActionComponent,
    CompassRoseComponent,
    StoryBoxComponent,
    InventoryComponent,
    LocationBoxComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    NgbModule,
    HttpClientModule
  ],
  providers: [InventoryService],
  bootstrap: [AppComponent]
})
export class AppModule { }
