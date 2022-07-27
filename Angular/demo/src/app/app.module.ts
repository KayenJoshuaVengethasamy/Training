import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';


import { FormsModule,ReactiveFormsModule } from '@angular/forms';
import { HttpClientModule } from '@angular/common/http';
import { AppRoutingModule } from './app-routing.module';

import { AppComponent } from './app.component';
import { CreateProductComponent } from './components/Products/create-product/create-product.component';
import { ProductDetailsComponent } from './components/Products/product-details/product-details.component';
import { ProductsListComponent } from './components/Products/products-list/products-list.component';
import { UpdateProductComponent } from './components/Products/update-product/update-product.component';
import { CreateCategoryComponent } from './components/Category/create-category/create-category.component';
import { CategoryListComponent } from './components/Category/category-list/category-list.component';
import { UpdateCategoryComponent } from './components/Category/update-category/update-category.component';
import { CategoryDetailsComponent } from './components/Category/category-details/category-details.component';



@NgModule({
  declarations: [
    AppComponent,
    CreateProductComponent,
    ProductDetailsComponent,
    ProductsListComponent,
    UpdateProductComponent,
    CreateCategoryComponent,
    CategoryListComponent,
    UpdateCategoryComponent,
    CategoryDetailsComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    ReactiveFormsModule,
    HttpClientModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
