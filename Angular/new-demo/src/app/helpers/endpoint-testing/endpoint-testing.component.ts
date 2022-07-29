import { Observable } from 'rxjs';
import { Component, OnInit } from '@angular/core';
import { EndpointTesterService } from '../endpoint-tester.service';
import { TesterClassA } from '../tester-class-a';
import { TesterClassB } from '../tester-class-b';
import {
  AbstractControl,
  FormBuilder,
  FormControl,
  FormGroup,
  Validators,
} from '@angular/forms';
import Validation from '../validation';

@Component({
  selector: 'app-endpoint-testing',
  templateUrl: './endpoint-testing.component.html',
  styleUrls: ['./endpoint-testing.component.scss'],
})
export class EndpointTestingComponent implements OnInit {
  categoryList!: Observable<TesterClassB[]>;
  product: TesterClassA = new TesterClassA();
  categoryItems!: TesterClassB[];
  productCategories!: string[];
  submitted = false;
  form: FormGroup = new FormGroup({
    productName: new FormControl(''),
    productDescription: new FormControl(''),
    productQuantity: new FormControl(''),
    password: new FormControl(''),
    confirmPassword: new FormControl(''),
    categories: new FormControl(false),
  });
  constructor(
    private formBuilder: FormBuilder,
    private es: EndpointTesterService
  ) {}
  newProduct(): void {
    this.submitted = false;
    this.product = new TesterClassA();
  }

  ngOnInit(): void {
    this.loadCategories();
    this.form = this.formBuilder.group(
      {
        productName: ['', Validators.required],
        productDescription: ['', Validators.required],
        productQuantity: ['', Validators.required],
        categories: [false, Validators.requiredTrue],
      },
      {
        validators: [Validation.match('password', 'confirmPassword')],
      }
    );
  }

  get f(): { [key: string]: AbstractControl } {
    return this.form.controls;
  }

  onSubmit(): void {
    this.submitted = true;
    if (this.form.invalid) {
      return;
    } else {
      this.createProduct();
      alert(JSON.stringify(this.form.value, null, 2));
    }
  }

  onReset(): void {
    this.submitted = false;
    this.form.reset();
  }

  createProduct(): void {
    this.product = new TesterClassA();
    this.categoryItems.filter((item) => 
    {
      console.log(item.categoryName)
      console.log(item.categoryID)
    })
    
    // this.es.createProduct(this.product).subscribe(
    //   (data) => {
    //     console.log(data);
    //     this.product = new TesterClassA();
    //   },
    //   (error) => console.log(error)
    // );
  }

  loadCategories() {
    this.es.getAllCategories().subscribe(
      (data: any) => {
        this.categoryItems = data;
        this.categoryItems.forEach((element: any) => {
          console.log(element.categoryName);
        });
      },
      (error: any) => console.log(error)
    );
  }
  get selectedCheckboxList() {
    return this.categoryItems.filter((item) => item.checked);
  }
}
// get selectedCheckboxList() {
//   return this.roles.filter(item => item.checked);
// }
// disableSelect = new FormControl(false);
// product: TesterClassA = new TesterClassA();
// category!: Observable<TesterClassB[]>;
// submitted = false;
// message = '';

// constructor(private es:EndpointTesterService) { }

// ngOnInit(): void {

//   this.reloadData();
// }

// reloadData(): void {
//   this.category = this.es.getAllCategories();
// }

// newProduct(): void {
//   this.submitted = false;
//   this.product = new TesterClassA;
// }

// createProduct(): void {
//   this.es.createProduct(this.product)
//     .subscribe(data => {
//       console.log(data)
//       this.product = new TesterClassA();
//     },
//       error => {
//         this.message = error
//         console.log(error)
//       });
// }

// onSubmit() {
//   this.submitted = true;
//   this.createProduct();
// }

// newProductCategory: TesterClassB = new TesterClassB();
// categorySubmitted = false;

// newCategory(): void {
//   this.categorySubmitted = false;
//   this.newProductCategory = new TesterClassB;
// }

// createCategory():void {
//   this.es.addCategory(1,this.newProductCategory)
//     .subscribe(data => {
//       console.log(data)
//       this.newProductCategory = new TesterClassB();
//       this.reloadData();
//     },
//       error => console.log(error));
// }

// onCategorySubmit() {
//   this.categorySubmitted = true;
//   this.disableSelect = new FormControl(false);
//   this.createCategory();
// }

// productID!: number;
// productDetails!: TesterClassA;
// productUpdate!: TesterClassA;
// productList!: Observable<TesterClassA[]>;
// product: TesterClassA = {
//   productName: '',
//   productDescription: '',
//   productQuantity: 0,
// };
// doThis!: string;
// submitted = false;

// categories?: TesterClassB;
// currentCategory: TesterClassB = {};
// currentIndex = -1;
// categoryName = '';
// ngOnInit(): void {
//   this.productList = this.endService.getAllProducts();
// }
// getAllProducts() {
//   this.productList = this.endService.getAllProducts();
// }

// deleteProduct(product_ID: number) {
//   this.endService.deleteProduct(product_ID).subscribe(
//     (data: any) => {
//       console.log(data);
//       this.getAllProducts();
//     },
//     (error: any) => console.log(error)
//   );
//   this.ngOnInit;
// }

// deleteAllProducts() {
//   this.endService.deleteAllProducts().subscribe(
//     (data: any) => {
//       console.log(data);
//       this.getAllProducts();
//     },
//     (error: any) => console.log(error)
//   );
//   this.ngOnInit;
// }

// getProductByID(productID: number) {
//   this.doThis = 'Details';
//   this.productDetails = new TesterClassA();
//   this.productID = productID;
//   this.endService.getProductByID(this.productID).subscribe(
//     (data: any) => {
//       console.log(data);
//       this.productDetails = data;
//       this.updateProduct(productID);
//     },
//     (error: any) => console.log(error)
//   );
// }

// updateProduct(productID: number) {
//   this.doThis = 'Update';
//   this.productUpdate = new TesterClassA();
//   this.productID = productID;
//   this.endService.getProductByID(this.productID).subscribe(
//     (data: any) => {
//       console.log(data);
//       this.productUpdate = data;
//     },
//     (error: any) => console.log(error)
//   );
//   this.getAllProducts();
// }

// onUpdate() {
//   this.endService.updateProduct(this.productID, this.productUpdate).subscribe(
//     (data) => {
//       console.log(data);
//       this.productUpdate = new TesterClassA();
//       this.ngOnInit;
//     },
//     (error) => console.log(error)
//   );
// }

// saveProduct() {
//   const data = {
//     productName: this.product.productName,
//     productDescription: this.product.productDescription,
//     productQuantity: this.product.productQuantity,
//   };

//   this.endService.createProduct(data).subscribe({
//     next: (res) => {
//       console.log(res);
//       this.submitted = true;
//     },
//     error: (e) => console.error(e),
//   });
// }

// newProduct() {
//   this.submitted = false;
//   this.product = {
//     productName: '',
//     productDescription: '',
//     productQuantity: 0,
//   };
// }

// getAllCategories() {
//   this.endService.getAllCategories().subscribe({
//     next: (data) => {
//       this.categories = data;
//       console.log(data);
//     },
//     error: (e) => console.error(e),
//   });
// }
// refreshList(): void {
//   this.getAllCategories();
//   this.currentCategory = {};
//   this.currentIndex = -1;
// }
// setActiveCategories(category:TesterClassB, index: number){
//   this.currentCategory = category;
//   this.currentIndex = index;
// }

// deleteCategory(category_ID: number) {
//   this.endService.deleteCategory(category_ID).subscribe(
//     (data: any) => {
//       console.log(data);
//       this.getAllProducts();
//     },
//     (error: any) => console.log(error)
//   );
// }
