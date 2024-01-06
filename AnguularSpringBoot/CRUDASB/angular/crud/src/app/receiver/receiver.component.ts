import { Component } from '@angular/core';
import {MediatorService} from '../mediator.service';
import { CommonModule } from '@angular/common';

@Component({
  selector: 'app-receiver',
  standalone: true,
  imports: [CommonModule],
  templateUrl: './receiver.component.html',
  styleUrl: './receiver.component.css'
})
export class ReceiverComponent {
constructor(private ms:MediatorService){}
responses:any
async showData(){
this.responses = await this.ms.SpringViewData()
}
}
