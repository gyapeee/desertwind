import {Injectable} from "@angular/core";
import {HttpClient} from "@angular/common/http";
import {environment} from '../../environments/environment'

@Injectable({
  providedIn: 'root'
})

export class StoryBoxService {

  constructor(private http: HttpClient) {
  }

  story(id: number) {
    return this.http.get(environment.apiUrl + `/jelenet/${id}`,{ responseType: 'text' });
  }
}
