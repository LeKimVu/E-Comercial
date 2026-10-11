package com.example.demo.repository;
import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.CartItem;


 public interface CartItemRepository extends JpaRepository<CartItem,String> {
	  List<CartItem> findByCartId(String cartId);

	    Optional<CartItem> findByCartIdAndProductId(
	            String cartId,
	            String productId
	    );
	}