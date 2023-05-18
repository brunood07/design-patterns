package br.com.bruno.store.budget.situation;

import br.com.bruno.store.budget.Budget;

import java.math.BigDecimal;

public class InAnalysis extends BudgetSituation {
    public BigDecimal calculateExtraDiscountValue(Budget budget) {
        return budget.getValue().multiply(new BigDecimal("0.05"));
    }

    public void approve(Budget budget) {
        budget.setSituation(new Approved());
    }

    public void reprove(Budget budget) {
        budget.setSituation(new Reproved());
    }

}
