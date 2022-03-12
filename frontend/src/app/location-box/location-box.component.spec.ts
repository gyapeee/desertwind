import { ComponentFixture, TestBed } from '@angular/core/testing';

import { LocationBoxComponent } from './location-box.component';

describe('LocationBoxComponent', () => {
  let component: LocationBoxComponent;
  let fixture: ComponentFixture<LocationBoxComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ LocationBoxComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(LocationBoxComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
