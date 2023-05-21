package br.com.bruno.store.order.actions;

import br.com.bruno.store.order.Order;

public class OrderLogs implements GenerateOrderAction {
    @Override
    public void execute(Order order) {
        System.out.println("Pedido foi gerado " + order);
    }
}
