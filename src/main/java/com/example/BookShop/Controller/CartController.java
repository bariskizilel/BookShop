package com.example.BookShop.Controller;

import com.example.BookShop.Dto.AddToCartDto;
import com.example.BookShop.Model.Cart;
import com.example.BookShop.Service.BookService;
import com.example.BookShop.Service.CartService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("cart")
@RequiredArgsConstructor
public class CartController {
    private final CartService cartService;

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping()
    public Cart addToCart(@RequestBody AddToCartDto addToCartDto) {
        return cartService.addToCart(addToCartDto);
    }


    @GetMapping("/{cartId}")
    public Cart viewCart(@PathVariable Integer cartId) {
        return cartService.viewCart(cartId);
    }

    @DeleteMapping("/{cartItemId}")
    public String deleteBookFromCart(@PathVariable Integer cartItemId) {
        return cartService.deleteBookFromCart(cartItemId);
    }
}
