import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { DemandeCommercialCreateComponent } from './view/demandesCommercial/demande-commercial-create/demande-commercial-create.component';
import { DemandeCommercialListComponent } from './view/demandesCommercial/demande-commercial-list/demande-commercial-list.component';
import { DemandeCommercialEditComponent } from './view/demandesCommercial/demande-commercial-edit/demande-commercial-edit.component';
import { DemandeCommercialViewComponent } from './view/demandesCommercial/demande-commercial-view/demande-commercial-view.component';
import { DemandesCommercialComponent } from './demandes-commercial/demandes-commercial.component';
import { FormsModule } from '@angular/forms';
import { HttpClientModule } from '@angular/common/http';
import { CommandeCreateComponent } from './commandes/commande-create/commande-create.component';
import { CommandeCreaeComponent } from './commandes/commande-creae/commande-creae.component';
import { CommandeListComponent } from './commandes/commande-list/commande-list.component';
import { CommandeViewComponent } from './commandes/commande-view/commande-view.component';
import { CommandeEditComponent } from './commandes/commande-edit/commande-edit.component';

@NgModule({
  declarations: [
    AppComponent,
    DemandeCommercialCreateComponent,
    DemandeCommercialListComponent,
    DemandeCommercialEditComponent,
    DemandeCommercialViewComponent,
    DemandesCommercialComponent,
    CommandeCreateComponent,
    CommandeCreaeComponent,
    CommandeListComponent,
    CommandeViewComponent,
    CommandeEditComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    HttpClientModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
