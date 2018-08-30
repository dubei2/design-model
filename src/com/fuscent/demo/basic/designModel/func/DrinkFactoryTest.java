package com.fuscent.demo.basic.designModel.func;

import com.fuscent.demo.basic.designModel.product.Drink;
import org.junit.Test;

public class DrinkFactoryTest {
    @Test
    public void fun1(){
        DrinkFactory factory = new XuebiFactory();
        Drink drink = factory.productDrink();
        System.out.println(drink.getName());
    }
}
