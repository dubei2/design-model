package com.fuscent.demo.basic.designModel.func;

import com.fuscent.demo.basic.designModel.product.Drink;
import com.fuscent.demo.basic.designModel.product.Xuebi;

public class XuebiFactory implements DrinkFactory {
    @Override
    public Drink productDrink() {
        return new Xuebi();
    }
}
