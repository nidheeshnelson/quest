import { Component } from '@angular/core';
import { CommonModule } from '@angular/common';
import { RouterOutlet } from '@angular/router';
import {FormsModule} from '@angular/forms'
import { MediatorService } from '../mediator.service';
@Component({
  selector: 'app-sender',
  standalone: true,
  imports: [CommonModule, RouterOutlet, FormsModule],
  templateUrl: './sender.component.html',
  styleUrl: './sender.component.css'
})
export class SenderComponent {
  constructor(private MS: MediatorService){}

  async reg(data:any){
    let newData = {
          "name28": data['name1'], 
          }
          this.MS.setName(newData)
  }

async register(data:any){
//   console.log(`in sender register function of data ${data}`);
//   let newData = {
//     "name28": data['name1'], 
//     "age":28,
//     "marks":[25,56,85]
//   }
//   console.log(`in sender register function of newSata age ${newData['age']} and marks ${newData['marks']}`)
//   this.MS.setName(newData)
//   this.MS.getdata(data)
this.MS.getComments().then((res:any)=>{
 console.log(res);
})
.catch((err:any)=>{
  console.log(err);
})
}
}
//res =  request send
// console.log(res);

