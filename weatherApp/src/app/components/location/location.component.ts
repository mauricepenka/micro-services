import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

import { Location } from 'src/app/models/location';
import { LocationService } from 'src/app/services/location/location.service';

@Component({
  selector: 'app-location',
  templateUrl: './location.component.html',
  styleUrls: ['./location.component.css', '../../resources/bootstrap/css/bootstrap.min.css']
})
export class LocationComponent implements OnInit {

  locations: Location[]

  constructor(private locationService: LocationService, private router: Router) {
    this.locations = []
  }

  ngOnInit() {
    this.findLocations();
  }

  findLocations() {
    this.locationService.findLocations()
      .subscribe(data => {
        console.log(data);
        this.locations = data;
      }, error => {
        console.log(error);
      });
  }


}
