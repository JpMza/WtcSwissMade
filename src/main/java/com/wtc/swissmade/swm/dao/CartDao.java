package com.wtc.swissmade.swm.dao;

import com.wtc.swissmade.swm.models.Cart;

import java.io.IOException;

public interface CartDao {
    Cart getCartByCartId(String CartId);

    Cart validate(String cartId) throws IOException;

    void update(Cart cart);
}
