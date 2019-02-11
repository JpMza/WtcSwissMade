package com.wtc.swissmade.swm.services;

import com.wtc.swissmade.swm.models.Cart;
import com.wtc.swissmade.swm.models.CartItem;

public interface CartItemService {

	void addCartItem(CartItem cartItem);
	void removeCartItem(String CartItemId);
	void removeAllCartItems(Cart cart);
}
