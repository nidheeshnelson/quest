import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class MedService {

  constructor() { }

  private dataToShare: any
  viewData(){
    return this.dataToShare
  }

  changeData(data:any){
    this.dataToShare = data

  }
}
