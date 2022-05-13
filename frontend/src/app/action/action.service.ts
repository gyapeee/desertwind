import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root',
})
export class ActionService {
  constructor(private http: HttpClient) {}

  action(id: string) {
    return this.http.post('http://localhost:8081/action', id);
  }
}
