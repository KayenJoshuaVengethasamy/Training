import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { Category } from 'src/app/classes/category';
import { CategoryService } from 'src/app/services/category.service';

@Component({
  selector: 'app-update-category',
  templateUrl: './update-category.component.html',
  styleUrls: ['./update-category.component.scss']
})
export class UpdateCategoryComponent implements OnInit {
  categoryID!:number;
  category!:Category;
  submitted = false;
  
  constructor(private ar:ActivatedRoute, private r:Router,private cs:CategoryService) { }

  ngOnInit(): void {
    this.submitted = false;
    this.category = new Category();
    this.categoryID = this.ar.snapshot.params['categoryID'];
    this.cs.getCategoryByID(this.categoryID)
      .subscribe((data: any) => {
        console.log(data)
        this.category = data;
      }, (error: any) => console.log(error));
  }

  updateCategory():void{

    this.cs.updateCategory(this.categoryID, this.category)
      .subscribe(data => {
        console.log(data);
        this.category = new Category();
        this.submitted = true;
        this.gotoList();
      }, error => console.log(error));
  }

  onSubmit() {
    this.updateCategory();    
  }

  gotoList() {
    this.r.navigate(['/products']);
  }

}