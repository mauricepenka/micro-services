import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { AtmosphericPressureComponent } from './atmospheric-pressure.component';

describe('AtmosphericPressureComponent', () => {
  let component: AtmosphericPressureComponent;
  let fixture: ComponentFixture<AtmosphericPressureComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ AtmosphericPressureComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(AtmosphericPressureComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
