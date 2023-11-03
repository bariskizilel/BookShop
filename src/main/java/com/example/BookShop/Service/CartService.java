package com.example.BookShop.Service;

import com.example.BookShop.Dto.AddToCartDto;
import com.example.BookShop.Model.Cart;

public interface CartService {
    Cart addToCart(AddToCartDto addToCartDto);
    Cart viewCart(Integer cartId);


    String deleteBookFromCart(Integer cartItemId);
}
