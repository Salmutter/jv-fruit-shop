package service.impl;

import java.util.List;
import model.FruitTransaction;
import service.FruitShopService;
import strategy.OperationStrategy;

public class FruitShopServiceImpl implements FruitShopService {
    private OperationStrategy operationStrategy;

    public FruitShopServiceImpl(OperationStrategy operationStrategy) {
        this.operationStrategy = operationStrategy;
    }

    @Override
    public void process(List<FruitTransaction> fruitTransactions) {
        for (FruitTransaction fruitData : fruitTransactions) {
            operationStrategy.get(fruitData.getOperationType()).operationHandle(fruitData);
        }

    }
}
