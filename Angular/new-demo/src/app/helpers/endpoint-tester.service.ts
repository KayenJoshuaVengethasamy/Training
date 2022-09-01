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
  private categoriesURL = 'http://localhost:8080/demo/api/categories';
  private testURL = 'http://localhost:8080/demo/api/testing';

  constructor(private http: HttpClient) { }


  registerProduct(info: TesterClassA): Observable<any> {
      return this.http.post<any>(`${this.testURL}/registerProduct`, info);
    }
  
  getAllProducts(): Observable<TesterClassA[]> {
    return this.http.get<TesterClassA[]>(`${this.productsURL}/getAllProducts`);
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
    return this.http.get<TesterClassB[]>(`${this.categoriesURL}/getAllCategories`);
  }

  deleteCategory(categoryID:number):Observable<any>{
    return this.http.delete(`${this.categoriesURL}/categories/${categoryID}`);
  }

  addCategory(productID:number, categoryID: number, category:any): Observable<any> {
    return this.http.post(`${this.categoriesURL}/categories/${productID}/${categoryID }`, null);  
  }

  getAllcategoriesByProductID(productsID:number): Observable<TesterClassB[]> {
    return this.http.get<TesterClassB[]>(`${this.categoriesURL}/getAllcategoriesByProductID/${productsID}`);

  }
}
