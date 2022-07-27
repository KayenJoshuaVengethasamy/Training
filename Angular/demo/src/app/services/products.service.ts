import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class ProductsService {

  private baseURL = 'http://localhost:8080/demo/api/v1/products';

  constructor(private http: HttpClient) { }

  getAllProducts(): Observable<any> {
    return this.http.get(`${this.baseURL}/getAllProducts`);
  }

  getProductByID(productID: number) {
    return this.http.get(`${this.baseURL}/getProductByID/${productID}`);
  }

  createProduct(product: Object): Observable<Object> {
    return this.http.post(`${this.baseURL}/createProduct`, product);
  }

  updateProduct(productID: number, value: any): Observable<Object> {
    return this.http.put(`${this.baseURL}/updateProduct/${productID}`, value);
  }

  deleteProduct(productID: number): Observable<any> {
    return this.http.delete(`${this.baseURL}/deleteProduct/${productID}`, { responseType: 'text' });
  }
}
