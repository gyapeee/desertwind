import { Component, OnInit } from '@angular/core';
import {StoryBoxService} from "../story-box/story-box.service";
import {JelenetDTO} from "../api/dtos";

@Component({
  selector: 'app-main-page',
  templateUrl: './main-page.component.html',
  styleUrls: ['./main-page.component.css'],
})
export class MainPageComponent implements OnInit {
  title: string = 'DesertWind';
  constructor(private storyBoxService:StoryBoxService) {
  }

  sceneTraces: string[] = [];
  sceneId: number = 2;
  story: JelenetDTO | null = null;
  direction: string = "";
  locationText: string = "";
  items: string[] = [];
  selectedItem: string = "";

  ngOnInit(): void {
    this.initSceneTraces();
    this.getStoryFromBackend();
  }

  private initSceneTraces(): void{
      let sceneTraces: string | null =  localStorage.getItem('sceneTraces');
      let notNullTraces: string = sceneTraces === null ? "" : sceneTraces;
      if (notNullTraces !== "" ){
        this.sceneTraces = JSON.parse(notNullTraces);
      }

      // get the latest scene from the localStorage
      if (this.sceneTraces.length > 0){
        this.sceneId = parseInt(this.sceneTraces[this.sceneTraces.length - 1]);
      }

  }

  onCompassRoseClicked(direction: string){
    // TODO remove this line after development
    console.log(direction);
    this.direction = direction;
    this.processDirectionChange();
  }

    onInventoryItemClicked(item: string){
      // TODO remove this line after development
      console.log(item);
      // TODO call használ

    }

  onActionClicked(action: string){
    // TODO remove this line after development
    console.log(action)
    if (action === 'Igen') {
      this.locationText = 'Az estét egy kicsi sátorban töltöd. Másnap reggel a sátrakat lebontják, elpakolnak mindent ‚s továbbhajtanak dél felé. Téged egy tíz fős csapat kelet\n' +
        'felé visz. Több napig utaztok, majd egy kis házhoz értek. Bementek a házba. Az egyik kísérőd elmozdítja a padlószőnyeget, és így egy csapóajtó válik\n' +
        'láthatóvá. Kinyitják az ajtót, és egy hosszú lépcsőn a mélybe ereszkedtek. Egy ember fent marad, hogy elrejtse a motorokat és őrködjön amíg visszatérnek\n' +
        'a többiek. Ami lent fogad, minden képzeletedet felülmúlja. Egy óriási bázisban vagytok a föld alatt. Egy acélajtó előtt álltok. Kétoldalról egy-egy biztonsági\n' +
        'kamera pásztáz felettetek. Társaid félmeztelenre vetkőznek, így láthatóvá válik a hátukra tetovált fekete koponya.A kamerák megállnak egy pillanatra, majd az\n' +
        'ajtó kinyílik. Itt egy szűkös terem fogad titeket benne egy furcsa készülékkel és egy 10 méteres kapuval. Az egyik társad ráhteszi a készülékre a tenyerét,\n' +
        'erre a kapu nagy robajjal kinyílik. Két őr jön ki, és láthatólag felismerik a kísérőidet. Felőled kérdezősködnek, majd miután a többiek elmondják hogy mit\n' +
        'keresel itt, beengednek titeket. Elvezetnek egy irodába. Itt készül rólad egy papír, majd kapsz egyneruhát. Végül megmutatják a kabinodat, és eddigi\n' +
        'kísérőid elmennek hogy utolérjék a századukat.';
      this.sceneId = 10;
      this.getStoryFromBackend();
    }
    if (action === 'Nem') {
      this.locationText = 'Úgy döntesz, nem fogadod el ajánlatukat. Elengednek, de figyelmeztetnek, hogy\n' +
        'többé ne gyere a tábor közelébe. Néhány napig vándorolsz, majd egy újabb\n' +
        'faluba érkezel. Itt a katonák észrevesznek, és beállítanak dolgozni. Életed\n' +
        'hátralévő részében hűen szolgálod az uralkodót.';
      this.sceneId = 1;
      this.getStoryFromBackend();
    }
    if ("Keresek" === action){
      this.updateInventory();
    }
  }

  private processDirectionChange() {
    if (this.story?.invalidDirs.includes(this.direction)){
      // print the invalidDirsText to location-box
      this.locationText = this.story?.invalidDirsText;
    } else {
      let newSceneID = this.getNewSceneID(this.direction);
      if (null == newSceneID){
        // direction cannot be processed
        throw new Error("Direction " + this.direction + " is not found in " +this.story?.validDirs);
      } else{
        this.sceneId = newSceneID;
        this.getStoryFromBackend();
      }
    }
  }

  private getStoryFromBackend() {
    this.storyBoxService
      .story(this.sceneId)
      .subscribe((storyBoxText) => {
        this.story = JSON.parse(storyBoxText);
        // TODO remove this line after development
        console.log(JSON.stringify(this.story));
        this.updateSceneTraces();
      });
  }

  private getNewSceneID(direction: string): number | null{
    let newSceneId = null;
    this.story?.validDirs.forEach((validDirDTO) => {
      if (direction === validDirDTO.name){
        newSceneId = validDirDTO.goToJelenet;
      }
    })
    return newSceneId;
  }

  private updateInventory(): void{
    let newItem = this.story?.search.item;
    if (newItem && !this.items.includes(newItem)){
      this.items.push(newItem);
    }
  }

  private updateSceneTraces(): void{
    // do not add the sceneId to the sceneTraces more than once
    if ( this.sceneTraces[this.sceneTraces.length - 1] !== this.sceneId.toString() ){
      this.sceneTraces.push(this.sceneId.toString());
    }
    localStorage.setItem('sceneTraces', JSON.stringify(this.sceneTraces));
  }
}
