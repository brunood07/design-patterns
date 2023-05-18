package br.com.bruno.store.order.actions;

import br.com.bruno.store.order.Order;

public class SendEmail implements GenerateOrderAction {
    public void execute(Order order) {
        System.out.println("Enviando email com dados do pedido");
    }

}
