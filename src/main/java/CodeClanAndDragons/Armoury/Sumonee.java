package CodeClanAndDragons.Armoury;

public enum Sumonee {

    DRAGON (30),
    DIREBAT(5),
    DIREBADGER(10);

    private final int damage;

    Sumonee(int damage) {
        this.damage = damage;
    }

    public int getDamage() {
        return this.damage;
    }
}
