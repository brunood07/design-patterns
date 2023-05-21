import br.com.bruno.store.budget.Budget;
import br.com.bruno.store.budget.BudgetItem;
import br.com.bruno.store.budget.BudgetRegister;
import br.com.bruno.store.http.JavaHttpClient;

import java.math.BigDecimal;

public class MainAdapter {
    public static void main(String[] args) {
        Budget budget = new Budget();
        budget.addItem(new BudgetItem(new BigDecimal("100")));
        budget.approve();
        budget.finish();

        BudgetRegister register = new BudgetRegister(new JavaHttpClient());
        register.register(budget);
    }
}
