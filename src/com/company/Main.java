package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Hero hero =new HeroAntiMag();
        hero.pick();
        hero =new SkinJacket(hero);
        hero.pick();

    }
}
