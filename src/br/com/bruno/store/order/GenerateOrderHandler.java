package br.com.bruno.store.order;

import br.com.bruno.store.budget.Budget;
import br.com.bruno.store.budget.BudgetItem;
import br.com.bruno.store.order.actions.GenerateOrderAction;
import br.com.bruno.store.order.actions.PersistOrderOnDatabase;
import br.com.bruno.store.order.actions.SendEmail;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

public class GenerateOrderHandler {
    private List<GenerateOrderAction> actions;

    public GenerateOrderHandler(List<GenerateOrderAction> actions) {
        this.actions = actions;
    }

    public void execute(GenerateOrder data) {
        Budget budget = new Budget();
        budget.addItem(new BudgetItem(data.getBudgetValue()));
        LocalDateTime date = LocalDateTime.now();

        Order order = new Order(data.getClientName(), date, budget);

        actions.forEach(a -> a.execute(order));
    }
}
