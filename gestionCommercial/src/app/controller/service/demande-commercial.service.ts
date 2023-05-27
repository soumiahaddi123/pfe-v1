import {Injectable} from '@angular/core';
import {DemandeCommercial} from '../model/demande-commercial.model';
import {HttpClient} from '@angular/common/http';
import {Observable} from "rxjs";

@Injectable({
  providedIn: 'root'
})
export class DemandeCommercialService {

  private _demandeCommercial: DemandeCommercial = new DemandeCommercial();
  private _demandesCommercial: Array<DemandeCommercial> = [];
  private url = "http://localhost:8036/api/v1/demande/";


  constructor(private http: HttpClient) {
  }

  public findAll() : Observable<Array<DemandeCommercial>> {
    return this.http.get<Array<DemandeCommercial>>(this.url);
  }

  public save(demandeCommercial: DemandeCommercial): Observable<number> {
    return this.http.post<number>(this.url, demandeCommercial);
    
  }


  public findByRef(ref: string): Observable<DemandeCommercial> {
    return this.http.get<DemandeCommercial>(this.url + "ref/" + ref)
  }

  public update(index:number,demandeCommercial:DemandeCommercial){
    
    this.demandeCommercial=demandeCommercial;

  }

  public get demandeCommercial(): DemandeCommercial {
    if (this._demandeCommercial == null) {
      this._demandeCommercial = new DemandeCommercial();
    }
    return this._demandeCommercial;
  }

  public set demandeCommercial(value: DemandeCommercial) {

    this._demandeCommercial = value;
  }

  public get demandesCommercial(): Array<DemandeCommercial> {
    if (this._demandesCommercial == null) {
      this._demandesCommercial = new Array<DemandeCommercial>();
    }
    return this._demandesCommercial;
  }

  public set demandesCommercial(value: Array<DemandeCommercial>) {
    this._demandesCommercial = value;
  }
}
