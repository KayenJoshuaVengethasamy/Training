import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Category } from 'src/app/classes/category';
import { CategoryService } from 'src/app/services/category.service';

@Component({
  selector: 'app-create-category',
  templateUrl: './create-category.component.html',
  styleUrls: ['./create-category.component.scss']
})
export class CreateCategoryComponent implements OnInit {

  category: Category = new Category();
  submitted = false;

  constructor(private cs: CategoryService, private r: Router) { }

  ngOnInit(): void {
  }

  newCategory(): void {
    this.submitted = false;
    this.category = new Category;
  }

  createCategory():void {
    this.cs.createCategory(this.category)
      .subscribe(data => {
        console.log(data)
        this.category = new Category();
        this.gotoList();
      },
        error => console.log(error));
  }

  onSubmit() {
    this.submitted = true;
    this.createCategory();
  }

  gotoList() {
    this.r.navigate(['/getAllCategories']);
  }

}

