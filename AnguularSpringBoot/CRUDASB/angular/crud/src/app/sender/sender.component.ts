import { Component } from '@angular/core';
import {FormsModule} from '@angular/forms';
import {MediatorService} from '../mediator.service'
@Component({
  selector: 'app-sender',
  standalone: true,
  imports: [FormsModule],
  templateUrl: './sender.component.html',
  styleUrl: './sender.component.css'
})
export class SenderComponent {
  constructor(private ms:MediatorService){}
async register(data:any){
let response:any=await this.ms.springAddData(data)
console.log(response);

}
}
