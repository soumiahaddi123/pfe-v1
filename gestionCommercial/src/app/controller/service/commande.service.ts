import { Injectable } from '@angular/core';
import {DemandeCommercial} from "../model/demande-commercial.model";
import {Commande} from "../model/commande.model";
import {HttpClient} from "@angular/common/http";
import {Observable} from "rxjs";

@Injectable({
  providedIn: 'root'
})
export class CommandeService {

  private _commande: Commande = new Commande();
  private _commandes: Array<Commande> =[];
  private url = "http://localhost:8036/api/v1/commande/";

  public findAll() : Observable<Array<Commande>> {
    return this.http.get<Array<Commande>>(this.url);
  }

  public findByRef(ref: string): Observable<Commande> {
    return this.http.get<Commande>(this.url + "ref/" + ref)
  }

  public get commande(): Commande {
    if (this._commande == null) {
      this._commande = new Commande();
    }
    return this._commande;
  }

  public set commande(value: Commande) {

    this._commande = value;
  }

  public get commade(): Array<Commande> {
    if (this._commandes == null) {
      this._commandes= new Array<Commande>();
    }
    return this._commandes;
  }

  public set commandes(value: Array<Commande>) {
    this._commandes = value;
  }
  constructor(private http: HttpClient) { }
}
