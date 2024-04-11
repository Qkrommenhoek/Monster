import java.util.HashMap;

public abstract class Monster {
    private Integer hp ;
    private Integer xp = 10;
    private Integer maxHP;
    private HashMap<String, Integer> items;
    public Monster(Integer maxHP, Integer xp, HashMap<String, Integer> items){
        this.maxHP = maxHP;
        hp = this.maxHP;
        this.xp = xp;
        this.items = items;
    }
    public Integer getXp() {
        return xp;
    }

    public boolean equals(Object object) {
        if (this == object) return true;
        if (!(object instanceof Monster monster)) return false;
        if (!super.equals(object)) return false;
        return java.util.Objects.equals(getHp(), monster.getHp()) && java.util.Objects.equals(getXp(), monster.getXp()) && java.util.Objects.equals(maxHP, monster.maxHP) && java.util.Objects.equals(getItems(), monster.getItems());
    }
    public String toString(){
        return hp + "/" + maxHP;
    }

    public int hashCode() {
        return java.util.Objects.hash(super.hashCode(), getHp(), getXp(), maxHP, getItems());
    }

    public Integer getHp() {
        return hp;
    }

    public void setHp(Integer hp) {
        this.hp = hp;
    }

    public HashMap<String, Integer> getItems() {
        return items;
    }

    public void setItems(HashMap<String, Integer> items) {
        this.items = items;
    }
}