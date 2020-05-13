package com.company;

import org.w3c.dom.ls.LSOutput;

public class Main {


    public static void main(String[] args) {
        Boss b = new Boss();
        b.setBossHealth(300);
        b.setBossDamage(50);
        b.setBossDefence("Magic");
        System.out.println("Boss information : " + "Health: " + b.getBossHealth() + ", " + "Damage: " + b.getBossDamage() + ", " + "Defence type: " + b.getBossDefence());
    }
}
