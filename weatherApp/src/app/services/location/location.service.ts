import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';

import { Location } from '../../models/location';

const config = {
  timeout: 30000,
  headers:
    new HttpHeaders(
      {
        'Access-Control-Allow-Origin': '*'
      }
    )
};

@Injectable({
  providedIn: 'root'
})
export class LocationService {

  constructor(private http: HttpClient) { }

  findLocations() {
    return this.http.get<Location[]>("http://localhost:8080/weather/locations");
  }
}
