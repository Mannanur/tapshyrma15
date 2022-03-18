package com.company;

public class Main {

    public static void main(String[] args) {
Person person = new Person();
Programmer programmer = new Programmer("Nurtilek", "bek end", "Google");
Dancer dancer = new Dancer("Bubusara", "Balet", "Akkuu");
Singer singer = new Singer("Ulan", "Rep", "TataUlan");



        System.out.println(programmer);
        programmer.learn();
        programmer.walk();
        programmer.eat();
        programmer.coding();

        System.out.println(dancer);
            dancer.learn();
            dancer.walk();
            dancer.eat();
            dancer.dancing();
            
        System.out.println(singer);
        singer.learn();
        singer.walk();
        singer.eat();
        singer.singing();




    }



}
