import { Routes } from '@angular/router';
import {YearComponent} from './year/year.component';
import {DayComponent} from './day/day.component';

export const routes: Routes = [
    {
        path:'y',component:YearComponent
    },
    {
        path:'d',component:DayComponent
    }
];
