package com.example.wojtek.javatesting;

/**
 * Created by Wojtek on 2016-01-03.
 */
class Osoba {
    public String imie;
    public String nazwisko = "Zgredek";
    public Osoba (String s) {
        imie = s;
        System.out.println("W osobie " +imie);
    }


}

class Polak extends Osoba {
    public String pesel;
    public Polak(String i,String p){
        super(i);
        pesel = p;
        System.out.println("W Polaku " + pesel);
    }
}

//    int wykonajDzialanie(int a,int b){
//        return a+b;
//    }
//
//    public static int dodaj (int a, int b){
//        System.out.println(a+b);
//
//        return (a+b);
//    }
//    public int pokazWynik(int q,int w){
//        System.out.println(": " + dodaj(q,w));
//        return(dodaj(q,w));
//    }


class A {public static String napis = "jestem A";}
class B extends A {public static String napis = "jestem B";}





