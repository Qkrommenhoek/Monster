package src.Monsters;

import src.Abilities.Attack;
import src.Abilities.RangedAttack;

import java.util.HashMap;
import java.util.Random;

public abstract class Monster {
    private Integer hp ;
    Integer agility;
    Integer def;
    Integer str;
    Attack attack;
    private Integer xp = 10;
    private Integer maxHP;
    private HashMap<String, Integer> items;
    public Monster(Integer maxHP, Integer xp, HashMap<String, Integer> items){
        this.maxHP = maxHP;
        hp = this.maxHP;
        this.xp = xp;
        this.items = items;
        this.str = 10;
        this.def = 10;
        this.agility = 10;
    }
    Integer getAttribute(Integer min, Integer max){
        Random rand = new Random();
        if(min>max){
            Integer temp = min;
            min = max;
            max = temp;
        }
        return rand.nextInt(max-min) + min;
    }
    boolean takeDamage(Integer damage){
        if(damage>0){
            System.out.println("The creature was hit for "+damage+" damage");
            this.hp-=damage;
        }
        if(this.hp<=0){
            System.out.println("Oh no! The creature has perished");
            System.out.println(this);
            return false;
        }
        System.out.println(this);
        return true;
    }
    public Integer attackTarget(Monster target){
        int dmg = attack.Attack(target);
        target.takeDamage(dmg);

        return dmg;
    }
    public Integer getXp() {
        return xp;
    }

    public Integer getAgility() {
        return agility;
    }

    public Integer getDef() {
        return def;
    }

    public Integer getStr() {
        return str;
    }

    public boolean equals(Monster monster){
        return this==monster;
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