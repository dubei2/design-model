package com.fuscent.demo.basic.designModel.func;

import com.fuscent.demo.basic.designModel.product.Drink;
import com.fuscent.demo.basic.designModel.product.LiangCha;

public class LiangChaFactory implements DrinkFactory {
    @Override
    public Drink productDrink() {
        return new LiangCha();
    }
}
