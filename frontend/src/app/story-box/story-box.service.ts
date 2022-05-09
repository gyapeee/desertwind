import {Injectable} from "@angular/core";
import {HttpClient} from "@angular/common/http";

@Injectable({
  providedIn: 'root'
})

export class StorBoxService {

  constructor(private http: HttpClient) {
  }

  inventory() {

    return this.http.get('http://localhost:8081/story',{ responseType: 'text' });
  }
}
