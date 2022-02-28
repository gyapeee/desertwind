import { ComponentFixture, TestBed } from '@angular/core/testing';

import { CompassRoseComponent } from './compass-rose.component';

describe('CompassRoseComponent', () => {
  let component: CompassRoseComponent;
  let fixture: ComponentFixture<CompassRoseComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ CompassRoseComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(CompassRoseComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
