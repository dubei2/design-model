package com.fuscent.demo.basic.designModel.abst;

import com.fuscent.demo.basic.designModel.product.Drink;
import com.fuscent.demo.basic.designModel.product.Kele;
import com.fuscent.demo.basic.designModel.product.LiangCha;
import com.fuscent.demo.basic.designModel.product.Xuebi;

public class DrinkFactory extends AbsDrinkFactory {
    @Override
    public Drink productKele() {
        return new Kele();
    }

    @Override
    public Drink productXuebi() {
        return new Xuebi();
    }

    @Override
    public Drink productLiangcha() {
        return new LiangCha();
    }
}
