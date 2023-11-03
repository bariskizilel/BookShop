package com.example.BookShop.Service;

import com.example.BookShop.Model.Book;


import java.util.List;

public interface BookService {

    Book getBookById(Integer id);

    List<Book> getAllBooks();

}
