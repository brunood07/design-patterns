package br.com.bruno.store.discounts;

import br.com.bruno.store.budget.Budget;

import java.math.BigDecimal;

public class DiscountZero extends Discount {
    public DiscountZero() {
        super(null);
    }

    public BigDecimal performCalculation(Budget budget) {
        return BigDecimal.ZERO;
    }

    @Override
    public boolean shouldApply(Budget budget) {
        return true;
    }
}
