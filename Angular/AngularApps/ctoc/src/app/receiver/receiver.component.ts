import { Component } from '@angular/core';
import { CommonModule, JsonPipe } from '@angular/common';
import { RouterOutlet } from '@angular/router';
import {FormsModule} from '@angular/forms';
import { MedService } from '../med.service';
import { json } from 'express';


@Component({
  selector: 'app-receiver',
  standalone: true,
  imports: [CommonModule, RouterOutlet, FormsModule],
  templateUrl: './receiver.component.html',
  styleUrl: './receiver.component.css'
})
export class ReceiverComponent {
  s11:string="";
  s22:string="";
  data:any;
  constructor(private med:MedService)
  {
// let d=this.med.viewData();
// console.log(d,"hiii")
  }
  regdata()
  {
    this.data=this.med.viewData();
    
    
    // console.log("fgdfgfggfhjgjky");
 
    
  }

}
