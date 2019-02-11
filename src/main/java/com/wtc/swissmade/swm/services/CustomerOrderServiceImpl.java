package com.wtc.swissmade.swm.services;

import com.wtc.swissmade.swm.dao.CustomerOrderDao;
import com.wtc.swissmade.swm.models.Cart;
import com.wtc.swissmade.swm.models.CartItem;
import com.wtc.swissmade.swm.models.CustomerOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

@Service
public class CustomerOrderServiceImpl implements CustomerOrderService {

    @Autowired
    private CustomerOrderDao customerOrderDao;

    @Autowired
    private CartService cartService;

    public void addCustomerOrder(CustomerOrder customerOrder) {
        customerOrderDao.addCustomerOrder(customerOrder);
    }

    public BigDecimal getCustomerOrderGrandTotal(String cartId) {
        //double grandTotal=0;
        BigDecimal grandTotal= BigDecimal.ZERO;
        Cart cart = cartService.getCartByCartId(cartId);
        List<CartItem> cartItems = cart.getCartItem();

        for(CartItem item: cartItems){
            grandTotal.add(item.getPrice());
        }
        return grandTotal;
    }

}

