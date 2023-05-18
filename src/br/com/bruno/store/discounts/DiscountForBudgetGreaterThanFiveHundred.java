package br.com.bruno.store.discounts;

import br.com.bruno.store.budget.Budget;

import java.math.BigDecimal;

public class DiscountForBudgetGreaterThanFiveHundred extends Discount {
    public DiscountForBudgetGreaterThanFiveHundred(Discount next) {
        super(next);
    }

    public BigDecimal performCalculation(Budget budget) {
        return budget.getValue().multiply(new BigDecimal("0.05"));
    }

    @Override
    public boolean shouldApply(Budget budget) {
        return budget.getValue().compareTo(new BigDecimal("500")) > 0;
    }
}
