package com.fuscent.demo.basic.designModel.func;

import com.fuscent.demo.basic.designModel.product.Drink;
import com.fuscent.demo.basic.designModel.product.Kele;

public class KeleFactory implements DrinkFactory {
    @Override
    public Drink productDrink() {
        return new Kele();
    }
}
