import { Injectable } from '@angular/core';
import { DemandeCommercial } from '../model/demande-commercial.model';
import { HttpClient } from '@angular/common/http';
@Injectable({
  providedIn: 'root'
})
export class DemandeCommercialService {

  private _demandeCommercial: DemandeCommercial = new DemandeCommercial();
  private _demandesCommercial: Array<DemandeCommercial> = [];

  

  constructor(private http: HttpClient) { }
  public findAll(){
    return this.http.get("demandeCommercial")
  }

  public save(){
    return this.demandesCommercial.push(this.demandeCommercial);
  }


  public findByRef(){
    return this.http.get("refOffre")
  }

  public get demandeCommercial(): DemandeCommercial {
    if(this._demandeCommercial==null){
      this._demandeCommercial = new DemandeCommercial();
    }
    return this._demandeCommercial;
  }
  public set demandeCommercial(value: DemandeCommercial) {
    
    this._demandeCommercial = value;
  }
  
  public get demandesCommercial(): Array<DemandeCommercial> {
    if(this._demandesCommercial==null){
      this._demandesCommercial = new Array<DemandeCommercial>();
    }
    return this._demandesCommercial;
  }
  public set demandesCommercial(value: Array<DemandeCommercial>) {
    this._demandesCommercial = value;
  }
}
