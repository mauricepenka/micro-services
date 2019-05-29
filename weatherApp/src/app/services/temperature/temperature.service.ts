import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';

import { Temperature } from '../../models/temperature';

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

export class TemperatureService {

  constructor(private http: HttpClient) { }

  findTemperatures() {
    return this.http.get<Temperature[]>("http://localhost:8080/weather/temperatures");
  }
}
