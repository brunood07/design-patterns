package br.com.bruno.store.discounts;

import br.com.bruno.store.budget.Budget;

import java.math.BigDecimal;

public class DiscountForMoreThanFiveItems extends Discount {
    public DiscountForMoreThanFiveItems(Discount next) {
        super(next);
    }

    public BigDecimal performCalculation(Budget budget) {
        return budget.getValue().multiply(new BigDecimal("0.1"));
    }

    @Override
    public boolean shouldApply(Budget budget) {
        return budget.getQuantityOfItems() > 5;
    }
}
