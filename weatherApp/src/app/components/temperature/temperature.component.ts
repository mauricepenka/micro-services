import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

import { Temperature } from 'src/app/models/temperature';
import { TemperatureService } from 'src/app/services/temperature/temperature.service';

@Component({
  selector: 'app-temperature',
  templateUrl: './temperature.component.html',
  styleUrls: ['./temperature.component.css', '../../resources/bootstrap/css/bootstrap.min.css']
})
export class TemperatureComponent implements OnInit {

  temperatures: Temperature[]

  constructor(private temperatureService: TemperatureService, private router: Router) {
    this.temperatures = []
  }

  ngOnInit() {
    this.findTemperatures();
  }

  findTemperatures() {
    this.temperatureService.findTemperatures()
      .subscribe(data => {
        console.log(data);
        this.temperatures = data;
      }, error => {
        console.log(error);
      });
  }

}
