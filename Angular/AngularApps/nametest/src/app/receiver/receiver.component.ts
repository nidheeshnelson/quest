import { Component } from '@angular/core';
import { CommonModule } from '@angular/common';
import { RouterOutlet } from '@angular/router';
import { MediatorService } from '../mediator.service'
@Component({
  selector: 'app-receiver',
  standalone: true,
  imports: [CommonModule, RouterOutlet],
  templateUrl: './receiver.component.html',
  styleUrl: './receiver.component.css'
})
export class ReceiverComponent {

constructor(private ms:MediatorService){}
  getData(){

    let name = this.ms.viewName()
    
    console.log(`in getdata function of receiver name ${name}`);

    let names = this.ms.viewAll()['name1']

    console.log(`in getdata function of receiver names ${names}`)
  }
  getting(){
    let nam = this.ms.viewName()
    console.log(`in getting function of receiver name ${nam}`);
  }

}
