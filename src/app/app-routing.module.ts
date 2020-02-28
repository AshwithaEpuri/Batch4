import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { ItemListComponent } from './eMart1/item/item-list/item-list.component';
import { ItemDisplayComponent } from './eMart1/item/item-display/item-display.component';
import { CartListComponent } from './eMart1/cart/cart-list/cart-list.component';
import { BillListComponent } from './eMart1/bill/bill-list/bill-list.component';
import { BillViewComponent } from './eMart1/bill/bill-view/bill-view.component';
import { LoginComponent } from './eMart1/signup/login/login.component';


const routes: Routes = [{
  path: 'item-display/:iId',
  component: ItemDisplayComponent
},
{
  path: 'item-list',
  component: ItemListComponent
},
{
  path: 'cart-list',
  component: CartListComponent
},
{
  path: 'bill-view',
  component: BillViewComponent
},

{
  path: 'bill-list',
  component: BillListComponent
},
{
 path:'login',
 component: LoginComponent
}

];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
