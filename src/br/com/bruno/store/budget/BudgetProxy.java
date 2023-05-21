package br.com.bruno.store.budget;

import java.math.BigDecimal;

public class BudgetProxy {
    private BigDecimal value;
    private Budget budget;

    public BudgetProxy(Budget budget) {
        this.value = budget.getValue();
        this.budget = budget;
    }

    public BigDecimal getValue() {
        if (value == null) {
            this.value = budget.getValue();
        }
        return value;
    }
}
