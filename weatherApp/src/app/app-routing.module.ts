import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { TemperatureComponent } from './components/temperature/temperature.component';
import { LocationComponent } from './components/location/location.component';

const routes: Routes = [
  {
    path: 'temperatures',
    component: TemperatureComponent
  },
  {
    path: 'locations',
    component: LocationComponent
  }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
