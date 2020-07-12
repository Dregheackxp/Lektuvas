package com.company;

import java.util.Random;

public class Lektuvas {
public void isskleistiVaziuokle(){
    Random random = new Random();
    int x = random.nextInt(2);
    try {




    int y = 5/x;
        System.out.println("ok");
    }

    catch (ArithmeticException e){
        System.out.println("error");
    }
    System.out.println("try");
}
}
