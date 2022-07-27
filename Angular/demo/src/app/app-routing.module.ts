import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';

import { ProductsListComponent } from './components/Products/products-list/products-list.component';
import { CreateProductComponent } from './components/Products/create-product/create-product.component';
import { UpdateProductComponent } from './components/Products/update-product/update-product.component';
import { ProductDetailsComponent } from './components/Products/product-details/product-details.component';

import { CategoryListComponent } from './components/Category/category-list/category-list.component';
import { CategoryDetailsComponent } from './components/Category/category-details/category-details.component';
import { CreateCategoryComponent } from './components/Category/create-category/create-category.component';
import { UpdateCategoryComponent } from './components/Category/update-category/update-category.component';

const routes: Routes = [
  { path: '', redirectTo: 'getAllProducts', pathMatch: 'full' },
  { path: 'getAllProducts', component: ProductsListComponent },
  { path: 'getProductByID/:productID', component: ProductDetailsComponent },
  { path: 'createProduct', component: CreateProductComponent },
  { path: 'updateProduct/:productID', component: UpdateProductComponent },

  { path: 'getAllCategories', component: CategoryListComponent },
  { path: 'getCategoryByID/:categoryID', component: CategoryDetailsComponent },
  { path: 'createCategory', component: CreateCategoryComponent },
  { path: 'updateCategory/:categoryID', component: UpdateCategoryComponent }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
