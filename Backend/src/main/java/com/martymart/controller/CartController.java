package com.martymart.controller;

import com.martymart.dto.CartDTO;
import com.martymart.dto.CartItemDTO;
import com.martymart.service.CartService;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("/api/v1/cart")
public class CartController {
    private final CartService cartService;

    public CartController(CartService cartService) {
        this.cartService = cartService;
    }

    @GetMapping("/")
    public CartDTO getCart() {
        return cartService.getCart();
    }

    @PostMapping("/")
    public void addItemToCart(@RequestBody CartItemDTO cartItemDTO) {
        cartService.addItemToCart(cartItemDTO);
    }

    @PutMapping("/cart-item/{cart_item_id}?action={action}")
    public void updateCartItem(@PathVariable("cart_item_id") String cartItemId, @RequestParam("action") String action) {
        cartService.updateCartItem(cartItemId, action);
    }

    @DeleteMapping("/cart-item/{cart_item_id}")
    public void removeItemFromCart(@PathVariable("cart_item_id") String cartItemId) {
        cartService.removeItemFromCart(cartItemId);
    }
}
