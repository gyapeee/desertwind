import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { BehaviorSubject, Observable } from 'rxjs';
import { Szoveg } from '../api/Szoveg';

@Injectable({
  providedIn: 'root',
})
export class CompassRoseService {
  currentStory = new BehaviorSubject<string>('');

  constructor(private http: HttpClient) {}

  compassRose(direction: string) : Observable<Szoveg>{
    // TODO please use constant as a config for URL basic
    // like const URL = http://localhost:8081/
    // TODO URL could be a configurable variable
    // for different environment like locahost, other servers if needed....
    return this.http.post<Szoveg>('http://localhost:8081/compassrose', direction);
  }
}
