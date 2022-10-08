import {Injectable} from "@angular/core";
import {HttpClient} from "@angular/common/http";

@Injectable({
  providedIn: 'root'
})

export class StoryBoxService {

  constructor(private http: HttpClient) {
  }

  story(id: number) {
    return this.http.get(`http://localhost:8081/jelenet/${id}`,{ responseType: 'text' });
  }
}
