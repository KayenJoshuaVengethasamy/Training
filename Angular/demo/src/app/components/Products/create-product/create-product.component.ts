import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Observable } from 'rxjs';
import { Category } from 'src/app/classes/category';
import { Products } from 'src/app/classes/products';
import { CategoryService } from 'src/app/services/category.service';
import { ProductsService } from 'src/app/services/products.service';
import {FormControl} from '@angular/forms';

@Component({
  selector: 'app-create-product',
  templateUrl: './create-product.component.html',
  styleUrls: ['./create-product.component.scss']
})
export class CreateProductComponent implements OnInit {
  disableSelect = new FormControl(false);
  product: Products = new Products();
  category!: Observable<Category[]>;
  submitted = false;

  constructor(private ps: ProductsService, private cs: CategoryService, private r: Router) { }

  ngOnInit(): void {

    this.reloadData();
  }

  reloadData(): void {
    this.category = this.cs.getAllCategories();
  }

  newProduct(): void {
    this.submitted = false;
    this.product = new Products;
  }

  createProduct(): void {
    this.ps.createProduct(this.product)
      .subscribe(data => {
        console.log(data)
        this.product = new Products();
        this.gotoList();
      },
        error => console.log(error));
  }

  onSubmit() {
    this.submitted = true;
    this.createProduct();
  }

  gotoList() {
    this.r.navigate(['/getAllProducts']);
  }

  newProductCategory: Category = new Category();
  categorySubmitted = false;
 

  newCategory(): void {
    this.categorySubmitted = false;
    this.newProductCategory = new Category;
  }

  createCategory():void {
    this.cs.createCategory(this.newProductCategory)
      .subscribe(data => {
        console.log(data)
        this.newProductCategory = new Category();
        this.reloadData();
      },
        error => console.log(error));
  }

  onCategorySubmit() {
    this.categorySubmitted = true;
    this.disableSelect = new FormControl(false);
    this.createCategory();
  }

}

