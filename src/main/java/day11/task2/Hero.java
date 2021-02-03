package day11.task2;

public abstract class Hero implements PhysAttack {
    int health;
    double physDef;
    int physAtt;
    double magicDef;

    public Hero() {
        health = 100;
    }

    @Override
    public void physicalAttack(Hero hero) {
        double attackScore = physAtt * (1 - hero.physDef);
        if (hero.health - attackScore < 0) {
            hero.health = 0;
        } else {
            hero.health -= attackScore;
        }
    }
}
