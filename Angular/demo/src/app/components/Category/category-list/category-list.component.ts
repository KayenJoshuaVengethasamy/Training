import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Observable } from 'rxjs';
import { Category } from 'src/app/classes/category';
import { CategoryService } from 'src/app/services/category.service';

@Component({
  selector: 'app-category-list',
  templateUrl: './category-list.component.html',
  styleUrls: ['./category-list.component.scss']
})
export class CategoryListComponent implements OnInit {
  category!: Observable<Category[]>;

  constructor(private cs: CategoryService, private r: Router) { }

  ngOnInit(): void {
    this.reloadData();
  }

  reloadData(): void {
    this.category = this.cs.getAllCategories();
  }
  
  categoryOnChange(e:any) {  
    console.log(e.target.value);  
  }  
  deleteCategory(categoryID: number) {
    this.cs.deleteCategory(categoryID)
      .subscribe(
        (data: any) => {
          console.log(data);
          this.reloadData();
        },
        (error: any) => console.log(error));
  }

  getCategoryByID(categoryID: number) {
    this.r.navigate(['getCategoryByID', categoryID]);
  }
}

