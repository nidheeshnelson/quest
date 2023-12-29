import { Component } from '@angular/core';
import { CommonModule } from '@angular/common';
import { RouterOutlet } from '@angular/router';
import {FormsModule} from '@angular/forms'

@Component({
  selector: 'app-day',
  standalone: true,
  imports: [FormsModule, CommonModule, RouterOutlet],
  templateUrl: './day.component.html',
  styleUrl: './day.component.css'
})
export class DayComponent {
num:number=0;
check:number=0;
week(){
this.check=this.num;
}
}
