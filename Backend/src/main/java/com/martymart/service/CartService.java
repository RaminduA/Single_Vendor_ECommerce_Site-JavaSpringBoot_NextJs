package com.martymart.service;

import com.martymart.dto.CartDTO;
import com.martymart.dto.CartItemDTO;

public interface CartService {
    CartDTO getCart();
    void addItemToCart(CartItemDTO cartItemDTO);
    void updateCartItem(String cartItemId, String action);
    void removeItemFromCart(String cartItemId);
}
