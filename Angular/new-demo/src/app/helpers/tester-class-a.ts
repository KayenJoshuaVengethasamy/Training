export class TesterClassA {
  productID?: number;
  productName?: string;
  productDescription?: string;
  productQuantity?: number;
  categories?: string[];

  constructor(
    productName: string,
    productDescription: string,
    productQuantity: number,
    categories: string[]
  ) {
    this.productName = productName;
    this.productDescription = productDescription;
    this.productQuantity = productQuantity;
    this.categories = categories;
  }
}
