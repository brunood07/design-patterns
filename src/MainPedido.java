
import br.com.bruno.store.order.GenerateOrder;
import br.com.bruno.store.order.GenerateOrderHandler;
import br.com.bruno.store.order.actions.OrderLogs;
import br.com.bruno.store.order.actions.PersistOrderOnDatabase;
import br.com.bruno.store.order.actions.SendEmail;

import java.math.BigDecimal;
import java.util.Arrays;

public class MainPedido {
    public static void main(String[] args) {
        String client = "Teste";
        BigDecimal budgetValue = new BigDecimal("300");
        int quantityOfItems = Integer.parseInt("2");

        GenerateOrder generatedData = new GenerateOrder(budgetValue, client, quantityOfItems);
        GenerateOrderHandler handler = new GenerateOrderHandler(Arrays.asList(
                new PersistOrderOnDatabase(),
                new SendEmail(),
                new OrderLogs()
        ));
        handler.execute(generatedData);
    }
}
