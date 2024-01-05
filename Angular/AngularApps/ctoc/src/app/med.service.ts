import { Injectable } from '@angular/core';
import { log } from 'console';

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
console.log("in changeData",data);

  }
}
