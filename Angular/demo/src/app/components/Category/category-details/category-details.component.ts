import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { Category } from 'src/app/classes/category';
import { CategoryService } from 'src/app/services/category.service';

@Component({
  selector: 'app-category-details',
  templateUrl: './category-details.component.html',
  styleUrls: ['./category-details.component.scss']
})
export class CategoryDetailsComponent implements OnInit {

  categoryID!: number;
  category!: Category;

  constructor(private ar: ActivatedRoute, private r: Router, private cs: CategoryService) { }

  ngOnInit(): void {
    this.category = new Category();
    this.categoryID = this.ar.snapshot.params['categoryID'];
    this.cs.getCategoryByID(this.categoryID)
      .subscribe(
        (data: any) => {
          console.log(data)
          this.category = data;
        }, (error: any) => console.log(error));
  }

  list() {
    this.r.navigate(['getAllProducts']);
  }
}