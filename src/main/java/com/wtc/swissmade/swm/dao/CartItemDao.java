package com.wtc.swissmade.swm.dao;

import com.wtc.swissmade.swm.models.Cart;
import com.wtc.swissmade.swm.models.CartItem;

public interface CartItemDao {

	void addCartItem(CartItem cartItem);
	void removeCartItem(String CartItemId);
	void removeAllCartItems(Cart cart);

}
