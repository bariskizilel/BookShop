package com.example.BookShop.Model;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Entity
@Data
public class Cart {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private Double totalPrice = 0.0;


    @OneToMany( cascade = CascadeType.ALL)
    @JsonManagedReference
    @JoinColumn(name = "cart_id", referencedColumnName = "id")
    private List<CartItem> cartItems = new ArrayList<>();


    public List<CartItem> getCartItems() {
        return cartItems;
    }
}
