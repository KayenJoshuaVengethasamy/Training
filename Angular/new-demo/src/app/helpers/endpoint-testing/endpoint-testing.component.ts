import { Component, OnInit } from '@angular/core';
import { EndpointTesterService } from '../endpoint-tester.service';
import { TesterClassA } from '../tester-class-a';

@Component({
  selector: 'app-endpoint-testing',
  templateUrl: './endpoint-testing.component.html',
  styleUrls: ['./endpoint-testing.component.scss'],
})
export class EndpointTestingComponent implements OnInit {
  form: any = {};
  signupInfo?: TesterClassA;
  isSignedUp = false;
  isSignUpFailed = false;
  errorMessage = '';
  progressing = false;
  selected = 'option2';
  constructor(private es: EndpointTesterService) { }

  ngOnInit() {
    this.progressing = false;
  }

  onSubmit() {
    console.log(this.form);
    this.progressing = true;

    this.signupInfo = new TesterClassA(
      this.form.productName,
      this.form.productDescription,
      this.form.productPrice,
      ['Category A']
    );

    this.es.registerProduct(this.signupInfo).subscribe(
      data => {
        console.log(data);
        this.isSignedUp = true;
        this.isSignUpFailed = false;
        this.progressing = false;
      },
      error => {
        console.log(error);
        this.errorMessage = error.error.message;
        this.isSignUpFailed = true;
        this.progressing = false;
      }
    );
  }
}

