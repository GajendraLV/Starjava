package com.xworks.metro.extranal;

import com.xworks.metro.internal.Coffee;
import com.xworks.metro.internal.ColdCoffee;
import com.xworks.metro.internal.CommanSugar;

public class CommanSugarRunner {
    public static void main(String[]args){

        CommanSugar sugar = new CommanSugar(1,false);
        CommanSugar brownSugar = new CommanSugar(2,true);
        CommanSugar blackSugar = new CommanSugar(3,false);

        ColdCoffee cold = new ColdCoffee(35,"StarBucks",blackSugar);
        Coffee coffee = new Coffee(20,"Coffee Adda",brownSugar);


        cold.displayColdCoffee();
        coffee.displayCoffee();

    }
}
