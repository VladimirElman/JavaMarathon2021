package day11.task2;

public class Magician extends Hero implements MagicAttack {
    int magicAtt = 20;

    public Magician() {
        physAtt = 5;
        magicDef = 0.8;
        physDef = 0;

    }

    @Override
    public void magicAttack(Hero hero) {

        double attackScore = magicAtt * (1 - hero.magicDef);
        if (hero.health - attackScore < 0) {
            hero.health = 0;
        } else {
            hero.health -= attackScore;
        }


    }

    @Override
    public String toString() {
        return "Magician{" +
                "health=" + health +
                '}';
    }
}
