package com.fuscent.demo.basic.designModel.abst;

import com.fuscent.demo.basic.designModel.product.Drink;
import org.junit.Test;

public class AbsDrinkFactoryTest
{
    @Test
    public void fun1(){
        DrinkFactory factory = new DrinkFactory();
        Drink drink = factory.productXuebi();
        System.out.println(drink.getName());
    }
}
