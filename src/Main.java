import br.com.bruno.store.budget.Budget;
import br.com.bruno.store.discounts.DiscountCalculator;
import br.com.bruno.store.tax.ICMS;
import br.com.bruno.store.tax.TaxCalculator;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        Budget budget = new Budget(new BigDecimal("100"), 1);
        TaxCalculator calculator = new TaxCalculator();
        //System.out.println(calculator.calculate(budget, new ICMS()));

        Budget budget2 = new Budget(new BigDecimal("200"), 6);
        DiscountCalculator discountCalculator = new DiscountCalculator();
        System.out.println(discountCalculator.calculate(budget2));

        Budget budget3 = new Budget(new BigDecimal("1000"), 1);
        System.out.println(discountCalculator.calculate(budget3));
    }
}