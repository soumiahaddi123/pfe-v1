import {Component} from '@angular/core';
import {DemandeCommercial} from 'src/app/controller/model/demande-commercial.model';
import {DemandeCommercialService} from 'src/app/controller/service/demande-commercial.service';

@Component({
  selector: 'app-demande-commercial-list',
  templateUrl: './demande-commercial-list.component.html',
  styleUrls: ['./demande-commercial-list.component.css']
})
export class DemandeCommercialListComponent {

  constructor(private demandeCommercialService: DemandeCommercialService) {
  }

  public get demandesCommercial(): Array<DemandeCommercial> {
    return this.demandeCommercialService.demandesCommercial;
  }

  public delete(index: number) {

    this.demandesCommercial.splice(index);

  }

  public update(index: number, demandeCommercial: DemandeCommercial) {

    this.demandeCommercialService.update(index, demandeCommercial);

  }

  ngOnInit(): void {

    this.demandeCommercialService.findAll();
  }

}
