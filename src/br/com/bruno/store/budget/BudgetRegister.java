package br.com.bruno.store.budget;

import br.com.bruno.store.DomainException;
import br.com.bruno.store.http.HttpAdapter;

import java.util.Map;

public class BudgetRegister {
    private HttpAdapter http;

    public BudgetRegister(HttpAdapter http) {
        this.http = http;
    }

    public void register(Budget budget) {
        if (!budget.isFinished()) {
            throw new DomainException("Orçamento não finalizado");
        }

        String url = "http://api.externa/orcamento";
        Map<String, Object> data = Map.of("value", budget.getValue(), "quantityOfItems", budget.getQuantityOfItems());

        http.post(url, data);
    }
}
