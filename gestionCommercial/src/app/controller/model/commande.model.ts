export class Commande {

  private _id:number |undefined ;
  private _ref:string |undefined ;
  private _total:number |undefined ;
  private _totalePaye:number |undefined ;
  get id(): number | undefined {
    return this._id;
  }

  set id(value: number | undefined) {
    this._id = value;
  }

  get ref(): string | undefined {
    return this._ref;
  }

  set ref(value: string | undefined) {
    this._ref = value;
  }

  get total(): number | undefined {
    return this._total;
  }

  set total(value: number | undefined) {
    this._total = value;
  }

  get totalePaye(): number | undefined {
    return this._totalePaye;
  }

  set totalePaye(value: number | undefined) {
    this._totalePaye = value;
  }

}
