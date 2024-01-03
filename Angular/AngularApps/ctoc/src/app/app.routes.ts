import { Routes } from '@angular/router';
import {ReceiverComponent} from './receiver/receiver.component';
import {SenderComponent} from './sender/sender.component';

export const routes: Routes = [
    {
        path:'s1',component:SenderComponent
    },
    {
        path:'s2',component:ReceiverComponent
    }
];
