import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppComponent } from './app.component';
import { HeaderComponent } from './components/header/header.component';
import { LogoArgComponent } from './components/logo-arg/logo-arg.component';
import { SocialComponent } from './components/social/social.component';
import { BotonLoginComponent } from './components/boton-login/boton-login.component';
import { AboutComponent } from './components/about/about.component';
import { ExperienceComponent } from './components/experience/experience.component';

@NgModule({
  declarations: [
    AppComponent,
    HeaderComponent,
    LogoArgComponent,
    SocialComponent,
    BotonLoginComponent,
    AboutComponent,
    ExperienceComponent
  ],
  imports: [
    BrowserModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
