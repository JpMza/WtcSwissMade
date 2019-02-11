package com.wtc.swissmade.swm.services;

import com.wtc.swissmade.swm.dao.CartItemDao;
import com.wtc.swissmade.swm.models.Cart;
import com.wtc.swissmade.swm.models.CartItem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CartItemServiceImpl implements CartItemService {

	@Autowired
	private CartItemDao cartItemDao;

	public CartItemDao getCartItemDao() {
		return cartItemDao;
	}

	public void setCartItemDao(CartItemDao cartItemDao) {
		this.cartItemDao = cartItemDao;
	}

	public void addCartItem(CartItem cartItem) {
		cartItemDao.addCartItem(cartItem);

	}

	public void removeCartItem(String CartItemId) {
		cartItemDao.removeCartItem(CartItemId);
	}

	public void removeAllCartItems(Cart cart) {
		cartItemDao.removeAllCartItems(cart);
	}

}
