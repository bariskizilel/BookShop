package com.example.BookShop.Dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@Data
@NoArgsConstructor
public class AddToCartDto {
    int bookId;
    int cartId;

    public AddToCartDto(int bookId) {
        this.bookId = bookId;
    }
}
