package com.example.BookShop.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;


@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int barcode;
    private String bookTitle;
    private String genre;
    private int price;

    public Book(int barcode, String bookTitle, String genre, int price) {
        this.barcode = barcode;
        this.bookTitle = bookTitle;
        this.genre = genre;
        this.price = price;
    }
}


