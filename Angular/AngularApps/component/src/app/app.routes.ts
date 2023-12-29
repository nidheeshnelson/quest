import { Routes } from '@angular/router';
import {PrimaryComponent} from './primary/primary.component';
import {SecondaryComponent} from './secondary/secondary.component';

export const routes: Routes = [
    {
        path:'s1',component:PrimaryComponent
    },
    {
        path:'s2',component:SecondaryComponent
    }
];
