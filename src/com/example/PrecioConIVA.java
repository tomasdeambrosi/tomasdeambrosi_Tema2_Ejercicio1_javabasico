package com.example;


public class PrecioConIVA {

    public static void main(String[] args) {

        double resultado1 = sumarIVA(100);
        System.out.println(resultado1);

        double resultado2 = sumarIVA(255.33d);
        System.out.println(resultado2);

        double resultado3 = sumarIVA(333);
        System.out.println(resultado3);
    }
    
    static double sumarIVA (double precio){

        return precio * 1.21d;

    }
}
