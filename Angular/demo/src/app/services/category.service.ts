import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Category } from '../classes/category';

@Injectable({
  providedIn: 'root'
})
export class CategoryService {
  
  private baseURL = 'http://localhost:8080/demo/api/v1/category';

  constructor(private http: HttpClient) { }

  getAllCategories(): Observable<Category[]> {
    return this.http.get<Category[]>(`${this.baseURL}/getAllCategories`);
  }

  getCategoryByID(categoryID: number) :Observable<Category>{
    return this.http.get<Category>(`${this.baseURL}/getCategoryByID/${categoryID}`);
  }

  createCategory(category: Category): Observable<Object> {
    return this.http.post(`${this.baseURL}/createCategory`, category);
  }

  updateCategory(categoryID: number, category: Category): Observable<Object> {
    return this.http.put(`${this.baseURL}/updateCategory/${categoryID}`, category);
  }

  deleteCategory(categoryID: number): Observable<any> {
    return this.http.delete(`${this.baseURL}/deleteCategory/${categoryID}`, { responseType: 'text' });
  }
}
