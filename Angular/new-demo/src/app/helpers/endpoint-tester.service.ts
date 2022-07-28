import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class EndpointTesterService {

  private productsURL = 'http://localhost:8080/demo/api/products';

  constructor(private http: HttpClient) { }

  getAllProducts(): Observable<any> {
    return this.http.get(`${this.productsURL}`);
  }

  getProductByID(productID: number) {
    return this.http.get(`${this.productsURL}/${productID}`);
  }

  createProduct(product: Object): Observable<Object> {
    return this.http.post(`${this.productsURL}`, product);
  }

  updateProduct(productID: number, value: any): Observable<Object> {
    return this.http.put(`${this.productsURL}/${productID}`, value);
  }

  deleteProduct(productID: number): Observable<any> {
    return this.http.delete(`${this.productsURL}/${productID}`, { responseType: 'text' });
  }

  deleteAllProducts(): Observable<any> {
    return this.http.delete(`${this.productsURL}`, { responseType: 'text' });
  }
}

