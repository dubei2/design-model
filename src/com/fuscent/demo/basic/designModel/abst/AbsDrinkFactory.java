package com.fuscent.demo.basic.designModel.abst;

import com.fuscent.demo.basic.designModel.product.Drink;
import com.fuscent.demo.basic.designModel.product.Kele;
import com.fuscent.demo.basic.designModel.product.LiangCha;
import com.fuscent.demo.basic.designModel.product.Xuebi;

public abstract class AbsDrinkFactory {
    public abstract Drink productKele();

    public abstract Drink productXuebi();

    public abstract Drink productLiangcha();
}
