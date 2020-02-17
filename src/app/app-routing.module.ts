import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { DisplayComponent } from './display/display.component';
import { EmployeeComponent } from './employee/employee.component';
import { RegisterComponent } from './register/register.component';
import { MovieListComponent } from './movies/movie-list/movie-list.component';
import { MovieEditComponent } from './movies/movie-edit/movie-edit.component';


const routes: Routes = [{
                         path:'display',
                         component:DisplayComponent
                        },
                        {
                          path:'employee',
                          component:EmployeeComponent
                        },
                        {
                          path:'register',
                          component:RegisterComponent
                        
                        },

                        {
                          path:'movie-list',
                          component:MovieListComponent
                        
                        },

                        {
                          path:'movie-edit',
                          component:MovieEditComponent
                        
                        }
                      ];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
