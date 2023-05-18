package br.com.bruno.store.discounts;

import br.com.bruno.store.budget.Budget;

import java.math.BigDecimal;

public abstract class Discount {
    protected Discount next;

    public Discount(Discount next) {
        this.next = next;
    }

    public BigDecimal calculate(Budget budget) {
        if (shouldApply(budget)) {
            performCalculation(budget);
        }

        return next.performCalculation(budget);
    }
    protected abstract BigDecimal performCalculation(Budget budget);
    protected abstract boolean shouldApply(Budget budget);
}
