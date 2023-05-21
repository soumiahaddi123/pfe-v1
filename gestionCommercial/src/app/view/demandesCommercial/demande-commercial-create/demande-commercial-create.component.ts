import { Component } from '@angular/core';
import { DemandeCommercial } from 'src/app/controller/model/demande-commercial.model';
import { DemandeCommercialService } from 'src/app/controller/service/demande-commercial.service';

@Component({
  selector: 'app-demande-commercial-create',
  templateUrl: './demande-commercial-create.component.html',
  styleUrls: ['./demande-commercial-create.component.css']
})
export class DemandeCommercialCreateComponent {

  
  constructor(private demandeCommercialService: DemandeCommercialService) { }

  public get demandeCommercial(): DemandeCommercial {
     return this.demandeCommercialService.demandeCommercial;
  }
  public save() {
     this.demandeCommercialService.save();
  }

  
 
 
  

}
