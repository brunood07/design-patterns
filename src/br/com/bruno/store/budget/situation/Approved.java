package br.com.bruno.store.budget.situation;

import br.com.bruno.store.DomainException;
import br.com.bruno.store.budget.Budget;

import java.math.BigDecimal;

public class Approved extends BudgetSituation {
    public BigDecimal calculateExtraDiscountValue(Budget budget) {
        return budget.getValue().multiply(new BigDecimal("0.05"));
    }

    @Override
    public void finish(Budget budget) {
        budget.setSituation(new Finished());
    }
}
