import br.com.bruno.store.budget.Budget;
import br.com.bruno.store.budget.BudgetItem;
import br.com.bruno.store.discounts.DiscountCalculator;
import br.com.bruno.store.tax.ICMS;
import br.com.bruno.store.tax.TaxCalculator;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        Budget budget = new Budget();
        budget.addItem(new BudgetItem(new BigDecimal("100")));
        TaxCalculator calculator = new TaxCalculator();
        //System.out.println(calculator.calculate(budget, new ICMS()));

        Budget budget2 = new Budget();
        budget2.addItem(new BudgetItem(new BigDecimal("1000")));
        DiscountCalculator discountCalculator = new DiscountCalculator();
        System.out.println(discountCalculator.calculate(budget2));

        Budget budget3 = new Budget();
        budget.addItem(new BudgetItem(new BigDecimal("500")));
        System.out.println(discountCalculator.calculate(budget3));
    }
}