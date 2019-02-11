package com.wtc.swissmade.swm.services;

import com.wtc.swissmade.swm.dao.CartDao;
import com.wtc.swissmade.swm.models.Cart;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CartServiceImpl implements CartService {

	@Autowired
	private CartDao cartDao;

	public CartDao getCartDao() {
		return cartDao;
	}

	public void setCartDao(CartDao cartDao) {
		this.cartDao = cartDao;
	}

	public Cart getCartByCartId(String CartId) {

		return cartDao.getCartByCartId(CartId);
	}

}
