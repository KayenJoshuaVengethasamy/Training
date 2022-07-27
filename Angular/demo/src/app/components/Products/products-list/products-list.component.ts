import { Observable } from "rxjs";
import { Component, OnInit } from "@angular/core";
import { Router } from '@angular/router';
import { Products } from "src/app/classes/products";
import { ProductsService } from "src/app/services/products.service";

@Component({
  selector: 'app-products-list',
  templateUrl: './products-list.component.html',
  styleUrls: ['./products-list.component.scss']
})
export class ProductsListComponent implements OnInit {
  products!: Observable<Products[]>;

  constructor(private ps: ProductsService, private r: Router) { }

  ngOnInit(): void {
    this.reloadData();
  }

  reloadData(): void {
    this.products = this.ps.getAllProducts();
  }

  deleteProduct(product_ID: number) {
    this.ps.deleteProduct(product_ID)
      .subscribe(
        (data: any) => {
          console.log(data);
          this.reloadData();
        },
        (error: any) => console.log(error));
  }

  getProductBYID(product_ID: number) {
    this.r.navigate(['getProductByID', product_ID]);
  }
}
