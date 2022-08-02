import { Component, OnInit } from '@angular/core';
import { Book } from './model/Book';
import { ProductListService } from './product-list.service';

@Component({
  selector: 'app-product-list',
  templateUrl: './product-list.component.html',
  styleUrls: ['./product-list.component.css'],
})
export class ProductListComponent implements OnInit {
  apiResponse: any;
  books: Book[] = [];
  productListService: ProductListService;

  constructor(ProductListService: ProductListService) {
    this.productListService = ProductListService;
  }

  ngOnInit(): void {
    this.apiResponse = this.productListService.getBook().subscribe((data) => {
      this.apiResponse = data;
      this.books = this.apiResponse.books;
    });
  }
}
