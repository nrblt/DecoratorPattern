package com.company;

public class SkinBoots extends Skin {
    public SkinBoots(Hero hero) {
        this.hero = hero;
    }

    @Override
    public void pick() {
        System.out.println("Now you have boots");
    }
}
