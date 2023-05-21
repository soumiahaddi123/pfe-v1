import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { DemandeCommercialCreateComponent } from './view/demandesCommercial/demande-commercial-create/demande-commercial-create.component';
import { DemandeCommercialListComponent } from './view/demandesCommercial/demande-commercial-list/demande-commercial-list.component';
import { DemandeCommercialEditComponent } from './view/demandesCommercial/demande-commercial-edit/demande-commercial-edit.component';
import { DemandeCommercialViewComponent } from './view/demandesCommercial/demande-commercial-view/demande-commercial-view.component';
import { DemandesCommercialComponent } from './demandes-commercial/demandes-commercial.component';

@NgModule({
  declarations: [
    AppComponent,
    DemandeCommercialCreateComponent,
    DemandeCommercialListComponent,
    DemandeCommercialEditComponent,
    DemandeCommercialViewComponent,
    DemandesCommercialComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
