package br.com.bruno.store.budget.situation;

import br.com.bruno.store.budget.Budget;

import java.math.BigDecimal;

public class Reproved extends BudgetSituation {
    public void finish(Budget budget) {
        budget.setSituation(new Finished());
    }

}
