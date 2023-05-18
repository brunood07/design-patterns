package br.com.bruno.store.order.actions;

import br.com.bruno.store.order.Order;

public interface GenerateOrderAction {
    public void execute(Order order);
}
