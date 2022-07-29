import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { TesterClassA } from './tester-class-a';
import { TesterClassB } from './tester-class-b';

@Injectable({
  providedIn: 'root'
})
export class EndpointTesterService {

  private productsURL = 'http://localhost:8080/demo/api/products';
  private baseURL = 'http://localhost:8080/demo/api/';
  private categoriesURL = 'http://localhost:8080/demo/api';

  constructor(private http: HttpClient) { }

  getAllProducts(): Observable<TesterClassA[]> {
    return this.http.get<TesterClassA[]>(`${this.productsURL}`);
  }

  getProductByID(productID: number): Observable<TesterClassA>  {
    return this.http.get<TesterClassA>(`${this.productsURL}/${productID}`);
  }

  createProduct(product: any): Observable<any> {
    return this.http.post(`${this.productsURL}`, product);
  }

  updateProduct(productID: number, value: any): Observable<Object> {
    return this.http.put(`${this.productsURL}/${productID}`, value);
  }

  deleteProduct(productID: number): Observable<any> {
    return this.http.delete(`${this.productsURL}/${productID}`);
  }

  deleteAllProducts(): Observable<any> {
    return this.http.delete(`${this.productsURL}`);
  }

  getAllCategories(): Observable<TesterClassB[]> {
    return this.http.get<TesterClassB[]>(`${this.categoriesURL}/categories`);
  }

  deleteCategory(categoryID:number):Observable<any>{
    return this.http.delete(`${this.categoriesURL}/categories/${categoryID}`);
  }

  addCategory(productID:number, category: any): Observable<any> {
    return this.http.post(`http://localhost:8080/demo/api/products/${productID}/categories`, category);  
  }
}
