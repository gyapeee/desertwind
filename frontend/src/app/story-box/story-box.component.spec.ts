import { ComponentFixture, TestBed } from '@angular/core/testing';

import { StoryBoxComponent } from './story-box.component';

describe('StoryBoxComponent', () => {
  let component: StoryBoxComponent;
  let fixture: ComponentFixture<StoryBoxComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ StoryBoxComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(StoryBoxComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
