import {Injectable} from "@angular/core";
import {HttpClient} from "@angular/common/http";

@Injectable({
  providedIn: 'root'
})

export class StoryBoxService {

  constructor(private http: HttpClient) {
  }

  story() {
    return this.http.get('http://localhost:8081/story',{ responseType: 'text' });
  }
}
