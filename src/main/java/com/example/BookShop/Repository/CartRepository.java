package com.example.BookShop.Repository;

import com.example.BookShop.Model.Cart;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface CartRepository extends JpaRepository<Cart, Integer> {

    @Query("select cart from Cart  cart where cart.id = :id")
    Cart findCartById(@Param("id") Integer id);
}
