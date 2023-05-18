package br.com.bruno.store.order.actions;

import br.com.bruno.store.order.Order;

public class PersistOrderOnDatabase implements GenerateOrderAction {

    public void execute(Order order) {
        System.out.println("Salvando pedido no banco de dados");
    }
}
