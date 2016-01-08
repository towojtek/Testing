package com.example.wojtek.javatesting;

/**
 * Created by Wojtek on 2016-01-04.
 */
interface WykonywaczObliczen {
    int wykonajObliczenie (int a , int b);
}

class Dodawacz implements WykonywaczObliczen{

    @Override
    public int wykonajObliczenie(int a, int b) {
        return a+b;
    }
}

class Odejmowacz implements WykonywaczObliczen {

    @Override
    public int wykonajObliczenie(int a, int b) {
        return a-b;
    }
    void metoda(){
        System.out.println("jeszcze jedna metoda");
    }
}
