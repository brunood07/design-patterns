package br.com.bruno.store.budget;

import br.com.bruno.store.budget.situation.BudgetSituation;
import br.com.bruno.store.budget.situation.Finished;
import br.com.bruno.store.budget.situation.InAnalysis;

import java.math.BigDecimal;

public class Budget {
    private BigDecimal value;
    private int quantityOfItems;
    private BudgetSituation situation;

    public BudgetSituation getSituation() {
        return situation;
    }

    public void setSituation(BudgetSituation situation) {
        this.situation = situation;
    }


    public Budget(BigDecimal value, int quantityOfItems) {
        this.value = value;
        this.quantityOfItems = quantityOfItems;
        this.situation = new InAnalysis();
    }

    public void ApplyExtraDiscount() {
        BigDecimal extraDiscountValue = this.situation.calculateExtraDiscountValue(this);
    }

    public void approve() {
        this.situation.approve(this);
    }

    public void reprove() {
        this.situation.reprove(this);
    }

    public void finish() {
        this.situation.finish(this);
    }

    public BigDecimal getValue() {
        return value;
    }

    public int getQuantityOfItems() {
        return quantityOfItems;
    }

    public boolean isFinished() {
        return situation instanceof Finished;
    }
}
