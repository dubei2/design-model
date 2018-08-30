package com.fuscent.demo.basic.designModel.simple;

import com.fuscent.demo.basic.designModel.product.Drink;
import com.fuscent.demo.basic.designModel.product.Kele;
import com.fuscent.demo.basic.designModel.product.LiangCha;
import com.fuscent.demo.basic.designModel.product.Xuebi;

public class DrinkFactory {
    public Drink produceDrink(String name){
        if("可乐".equals(name)){
            return new Kele();
        }else if("雪碧".equals(name)){
            return  new Xuebi();
        }else if("凉茶".equals(name)){
            return new LiangCha();
        }else{
            System.out.println(String.format("不存在 %s 饮料",name));
            return null;
        }
    }
}
