import { Component, OnInit } from '@angular/core';
import { persona } from 'src/app/model/persona.model';
import { PersonaService } from 'src/app/service/persona.service';

@Component({
  selector: 'app-about',
  templateUrl: './about.component.html',
  styleUrls: ['./about.component.css'],
})
export class AboutComponent implements OnInit {
  persona: persona = new persona('', '', ''); //relacionado con el persona/model

  constructor(public personaService: PersonaService) {}

  ngOnInit(): void {
    //el suscrbe conecta con el observable, este detecta los cambios y ejecuta una accion, cuando cambie la condicion de persona de arriba el suscribe, la info se pasa de persona al data y este lo pasa al service y este al back
    this.personaService.getPersona().subscribe(data => {this.persona = data});
  }
}
