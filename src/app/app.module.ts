import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppComponent } from './app.component';
import { HeaderComponent } from './components/header/header.component';
import { AboutComponent } from './components/about/about.component';
import { ExperienceComponent } from './components/experience/experience.component';
import { EducationComponent } from './components/education/education.component';
import { SkillsComponent } from './components/skills/skills.component';
import { ProgressBarComponent } from './components/progress-bar/progress-bar.component';
import { ProyectsComponent } from './components/proyects/proyects.component';
import { FooterComponent } from './components/footer/footer.component';
import { BarraIconosComponent } from './components/barra-iconos/barra-iconos.component';
import { MenuComponent } from './components/menu/menu.component';
import { HttpClientModule} from '@angular/common/http';
import { HomeComponent } from './components/home/home.component'
import { LoginComponent } from './components/login/login.component';
import { AppRoutingModule } from './app-routing.module';

@NgModule({
  declarations: [
    AppComponent,
    HeaderComponent,
    AboutComponent,
    ExperienceComponent,
    EducationComponent,
    SkillsComponent,
    ProgressBarComponent,
    ProyectsComponent,
    FooterComponent,
    BarraIconosComponent,
    MenuComponent,
    HomeComponent,
    LoginComponent,

  ],
  imports: [
    BrowserModule,
    HttpClientModule,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
