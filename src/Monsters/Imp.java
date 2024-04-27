package src.Monsters;

import src.Abilities.MeleeAttack;

import java.util.HashMap;

public class Imp extends Monster {

    public Imp(Integer maxHP, Integer xp, HashMap<String, Integer>items){
        super(maxHP,xp,items);
        Integer maxStr = 15;
        Integer maxDef = 6;
        Integer maxAgi = 3;

        attack = new MeleeAttack(this);
        str = super.getAttribute(str, maxStr);
        def = super.getAttribute(def,maxDef);
        agility = super.getAttribute(agility,maxAgi);

    }
    @Override
    public String toString(){
        return "Imp has : " + super.toString();
    }
}
