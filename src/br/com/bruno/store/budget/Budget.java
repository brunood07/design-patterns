package br.com.bruno.store.budget;

import br.com.bruno.store.budget.situation.BudgetSituation;
import br.com.bruno.store.budget.situation.Finished;
import br.com.bruno.store.budget.situation.InAnalysis;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Budget implements Budgetable {
    private BigDecimal value;
    private BudgetSituation situation;
    private List<Budgetable> items;

    public BudgetSituation getSituation() {
        return situation;
    }

    public void setSituation(BudgetSituation situation) {
        this.situation = situation;
    }


    public Budget() {
        this.value = BigDecimal.ZERO;
        this.items = new ArrayList<>();
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
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return value;
    }

    public int getQuantityOfItems() {
        return items.size();
    }

    public boolean isFinished() {
        return situation instanceof Finished;
    }

    public void addItem(Budgetable item) {
        this.value = value.add(item.getValue());
        this.items.add(item);
    }
}
