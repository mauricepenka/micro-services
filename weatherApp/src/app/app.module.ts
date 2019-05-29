import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { HttpClientModule } from '@angular/common/http';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { TemperatureComponent } from './components/temperature/temperature.component';
import { LocationComponent } from './components/location/location.component';
import { HumidityComponent } from './components/humidity/humidity.component';
import { AtmosphericPressureComponent } from './components/atmospheric-pressure/atmospheric-pressure.component';

@NgModule({
  declarations: [
    AppComponent,
    TemperatureComponent,
    LocationComponent,
    HumidityComponent,
    AtmosphericPressureComponent
  ],
  imports: [
    BrowserModule,
    HttpClientModule,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
