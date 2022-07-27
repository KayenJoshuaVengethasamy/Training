import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { Products } from 'src/app/classes/products';
import { ProductsService } from 'src/app/services/products.service';

@Component({
  selector: 'app-update-product',
  templateUrl: './update-product.component.html',
  styleUrls: ['./update-product.component.scss']
})
export class UpdateProductComponent implements OnInit {
  productID!:number;
  product!:Products;
  submitted = false;
  
  constructor(private ar:ActivatedRoute, private r:Router,private ps:ProductsService) { }

  ngOnInit(): void {
    this.submitted = false;
    this.product = new Products();
    this.productID = this.ar.snapshot.params['productID'];
    this.ps.getProductByID(this.productID)
      .subscribe((data: any) => {
        console.log(data)
        this.product = data;
      }, (error: any) => console.log(error));
  }

  updateProduct():void{

    this.ps.updateProduct(this.productID, this.product)
      .subscribe(data => {
        console.log(data);
        this.product = new Products();
        this.submitted = true;
        this.gotoList();
      }, error => console.log(error));
  }

  onSubmit() {
    this.updateProduct();    
  }

  gotoList() {
    this.r.navigate(['/products']);
  }

}
