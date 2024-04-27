package src.Abilities;

import src.Monsters.Monster;

public class RangedAttack implements Attack {
    Monster attacker;

// Assigns the one who will carry out the attack to the local variable
    public RangedAttack(Monster attacker){
        this.attacker = attacker;
    }

    //uses src.Abilities.Attack.java to carry out an attack on a target monster
    @Override
    public Integer Attack(Monster target){
        String message = attacker+ " uses ranged attack on "+target.toString();
        System.out.println(message);
        return attacker.getAgility()-target.getAgility();
    }
}
