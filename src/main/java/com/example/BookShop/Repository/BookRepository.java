package com.example.BookShop.Repository;

import com.example.BookShop.Model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;


@Repository
public interface BookRepository extends JpaRepository<Book, Integer> {

    @Query("select book from Book  book where book.id = :id")
    Book findBookById(@Param("id") Integer id);
}
