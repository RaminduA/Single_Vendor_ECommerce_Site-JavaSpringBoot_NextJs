package com.martymart.service.impl;

import com.martymart.dto.CartDTO;
import com.martymart.dto.CartItemDTO;
import com.martymart.entity.CartItem;
import com.martymart.repository.CartItemRepository;
import com.martymart.repository.CartRepository;
import com.martymart.service.CartService;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class CartServiceImpl implements CartService {
    private final CartRepository cartRepository;
    private final CartItemRepository cartItemRepository;
    private final ModelMapper modelMapper;

    public CartServiceImpl(CartRepository cartRepository, CartItemRepository cartItemRepository, ModelMapper modelMapper) {
        this.cartRepository = cartRepository;
        this.cartItemRepository = cartItemRepository;
        this.modelMapper = modelMapper;
    }

    @Override
    public CartDTO getCart() {
        String cartId = "CART_ID";
        return modelMapper.map(cartRepository.getCart(cartId), CartDTO.class);
    }

    @Override
    public void addItemToCart(CartItemDTO cartItemDTO) {
        CartItem cartItem = modelMapper.map(cartItemDTO, CartItem.class);
        cartItemRepository.saveCartItem(cartItem);
    }

    @Override
    public void updateCartItem(String cartItemId, String action) {
        CartItem cartItem = new CartItem();
        cartItemRepository.updateCartItem(cartItem);
    }

    @Override
    public void removeItemFromCart(String cartItemId) {
        cartItemRepository.deleteCartItem(cartItemId);
    }
}
