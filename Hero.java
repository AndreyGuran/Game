package domain;

public class Hero extends FantasyCharacter {

    public Hero(String name, int healthPoints, int strength, int dexterity, int xp, int gold) {
        super(name, healthPoints, strength, dexterity, xp, gold);
    }

    public static class Goblin extends FantasyCharacter {
        public Goblin(String name, int healthPoints, int strength, int dexterity, int xp, int gold) {
            super(name, healthPoints, strength, dexterity, xp, gold);
        }

        public static class Skeleton extends FantasyCharacter {
            public Skeleton(String name, int healthPoints, int strength, int dexterity, int xp, int gold) {
                super(name, healthPoints, strength, dexterity, xp, gold);
            }
        }
    }
}
