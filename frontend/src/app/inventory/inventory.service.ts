import {Injectable} from "@angular/core";
import {HttpClient} from "@angular/common/http";

@Injectable({
  providedIn: 'root'
})

export class InventoryService {

  constructor(private http: HttpClient) {
  }

  inventory() {

    return this.http.get('http://localhost:8081/inventory',{ responseType: 'text' });
  }
}
