package com.example.BookShop.Service.ServiceImpl;

import com.example.BookShop.Model.Book;
import com.example.BookShop.Repository.BookRepository;
import com.example.BookShop.Service.BookService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BookServiceImpl implements BookService {

    private final BookRepository bookRepository;




    @Override
    public Book getBookById(Integer id) {
        return bookRepository.findById(id).orElse(null);
    }
    @Override
    public List<Book> getAllBooks() {
        return bookRepository.findAll();
    }


}
