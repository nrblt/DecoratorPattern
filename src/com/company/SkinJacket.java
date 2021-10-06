package com.company;

public class SkinJacket extends Skin {
    public SkinJacket(Hero hero) {
        this.hero = hero;
    }

    @Override
    public void pick() {
        System.out.println("Now you have Jacket");
    }
}
