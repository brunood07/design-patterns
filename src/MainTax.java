import br.com.bruno.store.budget.Budget;
import br.com.bruno.store.budget.BudgetItem;
import br.com.bruno.store.tax.ICMS;
import br.com.bruno.store.tax.ISS;
import br.com.bruno.store.tax.TaxCalculator;

import java.math.BigDecimal;

public class MainTax {
    public static void main(String[] args) {
        Budget budget = new Budget();
        budget.addItem(new BudgetItem(new BigDecimal("100")));
        TaxCalculator calculator = new TaxCalculator();

        System.out.println(calculator.calculate(budget, new ISS(new ICMS(null))));
    }

}
