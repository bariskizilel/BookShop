package com.example.BookShop.Service.ServiceImpl;

import com.example.BookShop.Dto.AddToCartDto;
import com.example.BookShop.Model.Book;
import com.example.BookShop.Model.Cart;
import com.example.BookShop.Model.CartItem;
import com.example.BookShop.Repository.BookRepository;
import com.example.BookShop.Repository.CartItemRepository;
import com.example.BookShop.Repository.CartRepository;
import com.example.BookShop.Service.CartService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class CartServiceImpl implements CartService {

    private final CartRepository cartRepository;

    private final CartItemRepository cartItemRepository;
    private final BookRepository bookRepository;



    @Override
    public Cart viewCart(Integer cartId) {
        return cartRepository.findById(cartId)
                .orElse(null);
    }

    public String deleteBookFromCart(Integer cartItemId) {
        Optional<CartItem> cartItem = cartItemRepository.findById(cartItemId);

        if(cartItem.isEmpty()) {
            return "there is no cart item with this id";
        } else {
            cartItemRepository.deleteById(cartItemId);
        }

        return "Cart Item with id:" + cartItemId + " is deleted";
    }

    @Override
    public Cart addToCart(AddToCartDto addToCartDto) {
        Cart cart = cartRepository.findById(addToCartDto.getCartId())
                .orElse(new Cart());

        Book book = bookRepository.findBookById(addToCartDto.getBookId());


        cart.setTotalPrice(cart.getTotalPrice() + book.getPrice());

        CartItem cartItem = new CartItem();
        cartItem.setBook(book);
        cartItem.setCart(cart);

        cart.getCartItems().add(cartItem);
        cartRepository.save(cart);



        return cart;
    }

}
