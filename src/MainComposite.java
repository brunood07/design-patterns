import br.com.bruno.store.budget.Budget;
import br.com.bruno.store.budget.BudgetItem;
import br.com.bruno.store.budget.BudgetProxy;

import java.math.BigDecimal;

public class MainComposite {
    public static void main(String[] args) {
        Budget olderBudget = new Budget();
        olderBudget.addItem(new BudgetItem(new BigDecimal("200")));
        olderBudget.reprove();

        Budget newBudget = new Budget();
        newBudget.addItem(new BudgetItem(new BigDecimal("500")));
        newBudget.addItem(olderBudget);

        BudgetProxy proxy = new BudgetProxy(newBudget);

        System.out.println(proxy.getValue());
        System.out.println(proxy.getValue());
        System.out.println(proxy.getValue());
        System.out.println(proxy.getValue());
    }
}
