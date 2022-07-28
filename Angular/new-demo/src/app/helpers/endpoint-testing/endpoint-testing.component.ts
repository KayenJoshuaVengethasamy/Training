import { Observable } from 'rxjs';
import { Component, OnInit } from '@angular/core';
import { EndpointTesterService } from '../endpoint-tester.service';
import { TesterClassA } from '../tester-class-a';

@Component({
  selector: 'app-endpoint-testing',
  templateUrl: './endpoint-testing.component.html',
  styleUrls: ['./endpoint-testing.component.scss'],
})
export class EndpointTestingComponent implements OnInit {
  productID!: number;
  productDetails!: TesterClassA;
  productUpdate!: TesterClassA;
  productList!: Observable<TesterClassA[]>;
  doThis!:string;

  constructor(private endService: EndpointTesterService) {}

  ngOnInit(): void {
    this.productList = this.endService.getAllProducts();
  }

  getAllProducts() {
    this.productList = this.endService.getAllProducts();
  }

  deleteProduct(product_ID: number) {
    this.endService.deleteProduct(product_ID).subscribe(
      (data: any) => {
        console.log(data);
        this.getAllProducts();
      },
      (error: any) => console.log(error)
    );
  }

  deleteAllProducts() {
    this.endService.deleteAllProducts().subscribe(
      (data: any) => {
        console.log(data);
        this.getAllProducts();
      },
      (error: any) => console.log(error)
    );
  }

  getProductByID(productID: number) {
    this.doThis = "Details"
    this.productDetails = new TesterClassA();
    this.productID = productID;
    this.endService.getProductByID(this.productID).subscribe(
      (data: any) => {
        console.log(data);
        this.productDetails = data;
      },
      (error: any) => console.log(error)
    );
  }

  updateProduct(productID: number) {
    this.doThis = "Update"
    this.productUpdate = new TesterClassA();
    this.productID = productID;
    this.endService.getProductByID(this.productID).subscribe(
      (data: any) => {
        console.log(data);
        this.productUpdate = data;
      },
      (error: any) => console.log(error)
    );
    this.getAllProducts();
  }

  onUpdate() {
    this.endService.updateProduct(this.productID, this.productUpdate).subscribe(
      (data) => {
        console.log(data);
        this.productUpdate = new TesterClassA();
      },
      (error) => console.log(error)
    );
  }
}
