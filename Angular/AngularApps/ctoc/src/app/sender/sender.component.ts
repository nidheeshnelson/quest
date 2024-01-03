import { Component } from '@angular/core';
import { CommonModule } from '@angular/common';
import { RouterOutlet } from '@angular/router';
import { FormsModule } from '@angular/forms';
import { MedService } from '../med.service'
@Component({
  selector: 'app-sender',
  standalone: true,
  imports: [CommonModule, RouterOutlet, FormsModule],
  templateUrl: './sender.component.html',
  styleUrl: './sender.component.css'
})
export class SenderComponent {
  constructor(private med:MedService)
  {

  }
newData(data: any)
{
  console.log(data);
  this.med.changeData(data);

}
}
