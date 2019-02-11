package com.wtc.swissmade.swm.services;

import com.wtc.swissmade.swm.models.CustomerOrder;

import java.math.BigDecimal;

public interface CustomerOrderService {

    void addCustomerOrder(CustomerOrder customerOrder);
    BigDecimal getCustomerOrderGrandTotal(String cartId);
}
