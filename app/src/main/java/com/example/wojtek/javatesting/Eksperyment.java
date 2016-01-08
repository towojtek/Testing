package com.example.wojtek.javatesting;

/**
 * Created by Wojtek on 2016-01-04.
 */
class Eksperyment {
    {
        System.out.println("blok 1");
    }
    public int test(String s){
        System.out.println(s);
        return 0;
    }
    public int a = test("inicjalizacja");
    Eksperyment(){
        System.out.println("konstruktor");
    }
    {
        System.out.println("blok 2");
    }
}
