import { HttpClient } from '@angular/common/http'; //este usa el oservable
import { Injectable} from '@angular/core';
import { Observable } from 'rxjs';
import { persona } from '../model/persona.model';

@Injectable({
  providedIn: 'root'
})

export class PersonaService {

  URL = 'http://localhost:8080/persona/';

  constructor(private http:HttpClient) {}
  // el observable hace las perticione asincronas
   public getPersona(): Observable<persona>{    
    return this.http.get<persona>(this.URL+'perfil');
   }
}
