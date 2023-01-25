package CodeClanAndDragons.Armoury;

public enum Spell {
    FIRE(20, "Fireball"),
    WIND(15, "Gust"),
    LIGHTNING(18, "Lightning Strike"),
    WATER(12, "Aquis");

    private final int damage;
    private final String spellName;

    Spell(int damage, String spellName){
        this.damage = damage;
        this.spellName = spellName;
    }

    public int getSpellDamage() {
        return this.damage;
    }

    public String getSpellName() {
        return this.spellName;
    }
}
