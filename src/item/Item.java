package item;

public class Item {

	protected String name;
    protected int level;
    protected float weight;
    protected String characterClass;
    protected int atack;
    protected int defense;
    protected int hp;


    public Item(String name, int level, String characterClass,float weight, int atack, int defense, int hp) {
        this.name = name;
        this.level = level;
        this.weight = weight;
        this.characterClass = characterClass;
        this.atack = atack;
        this.defense = defense;
        this.hp = hp;
     
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLevel() {
        return this.level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public float getWeight() {
        return this.weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public String getCharacterClass() {
        return this.characterClass;
    }

    public void setCharacterClass(String characterClass) {
        this.characterClass = characterClass;
    }

    public int getAtack() {
        return this.atack;
    }

    public void setAtack(int atack) {
        this.atack = atack;
    }

    public int getDefense() {
        return this.defense;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

    public int getHp() {
        return this.hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }
}