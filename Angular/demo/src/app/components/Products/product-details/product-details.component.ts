import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { Products } from 'src/app/classes/products';
import { ProductsService } from 'src/app/services/products.service';

@Component({
  selector: 'app-product-details',
  templateUrl: './product-details.component.html',
  styleUrls: ['./product-details.component.scss']
})
export class ProductDetailsComponent implements OnInit {

  productID!: number;
  product!: Products;

  constructor(private ar: ActivatedRoute, private r: Router, private ps: ProductsService) { }

  ngOnInit(): void {
    this.product = new Products();
    this.productID = this.ar.snapshot.params['productID'];
    this.ps.getProductByID(this.productID)
      .subscribe(
        (data: any) => {
          console.log(data)
          this.product = data;
        }, (error: any) => console.log(error));
  }

  list() {
    this.r.navigate(['products']);
  }
}
