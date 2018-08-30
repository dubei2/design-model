package com.fuscent.demo.basic.designModel.simple;

import com.fuscent.demo.basic.designModel.product.Drink;
import org.junit.Test;

public class DrinkFactoryTest {
    @Test
    public void fun1(){
        DrinkFactory factory = new DrinkFactory();
        Drink drink = factory.produceDrink("雪碧");
        System.out.println( drink.getName());;
    }
}
