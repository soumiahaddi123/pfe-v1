import { ComponentFixture, TestBed } from '@angular/core/testing';

import { DemandeCommercialEditComponent } from './demande-commercial-edit.component';

describe('DemandeCommercialEditComponent', () => {
  let component: DemandeCommercialEditComponent;
  let fixture: ComponentFixture<DemandeCommercialEditComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [DemandeCommercialEditComponent]
    });
    fixture = TestBed.createComponent(DemandeCommercialEditComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
