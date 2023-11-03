package com.example.BookShop.Configuration;

import com.example.BookShop.Model.Book;
import com.example.BookShop.Repository.BookRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class BookConfig {

    @Bean
    CommandLineRunner commandLineRunner(BookRepository bookRepository) {
        return args -> {
            bookRepository.saveAll(List.of(
                    new Book(101, "Kumarbaz", "Roman", 24),
                    new Book(102, "Budala", "Aşk Öyküsü", 40),
                    new Book(103, "Suç ve Ceza", "Psikolojik Kurgu", 40),
                    new Book(104, "Sefiller", "Trajedi", 35),
                    new Book(105, "Bir Otostopçunun Galaksi Rehberi", "Bilim Kurgu Komedisi", 25),
                    new Book(106, "Cesur Yeni Dünya", "Distopya", 30),
                    new Book(107, "Fahrenheit 451", "Distopya", 30),
                    new Book(108, "Yeraltından Notlar", "Roman", 25),
                    new Book(109, "Faust", "Tiyatro/Oyun", 27),
                    new Book(110, "İnsan Ne İle Yaşar", "Hikaye", 25)
                    ));
        };
    }
}
