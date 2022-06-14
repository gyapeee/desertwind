import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root',
})
export class LocationBoxService {
  constructor(private http: HttpClient) {}

  location() {
    return this.http.get('http://localhost:8081/location', {
      responseType: 'text',
    });
  }
}
