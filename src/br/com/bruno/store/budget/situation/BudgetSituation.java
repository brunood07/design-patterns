package br.com.bruno.store.budget.situation;

import br.com.bruno.store.DomainException;
import br.com.bruno.store.budget.Budget;

import java.math.BigDecimal;

public abstract class BudgetSituation {
    public BigDecimal calculateExtraDiscountValue(Budget budget) {
        return BigDecimal.ZERO;
    }
    public void approve(Budget budget) {
        throw new DomainException("Orçamento não pode ser aprovado!");
    }

    public void reprove(Budget budget) {
        throw new DomainException("Orçamento não pode ser reprovado!");
    }

    public void finish(Budget budget) {
        throw new DomainException("Orçamento não pode ser finalizado!");
    }
}
