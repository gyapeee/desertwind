import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root',
})
export class CompassRoseService {
  constructor(private http: HttpClient) {}

  compassRose(direction: number) {
    // TODO please use constant as a config for URL basic
    // like const URL = http://localhost:8081/
    // TODO URL could be a configurable variable
    // for different environment like locahost, other servers if needed....
    console.log(direction);
    return this.http.post('http://localhost:8081/compassrose', direction, {
      responseType: 'json',
    });
  }
}
