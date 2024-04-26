package src.Abilities;

import src.Monsters.Monster;

public class MeleeAttack implements Attack{
    Monster attacker;

    // Assigns the one who will carry out the attack to the local variable
    public MeleeAttack(Monster attacker){
        this.attacker = attacker;
    }

    //uses src.Abilities.Attack.java to carry out an attack on a target monster
    @Override
    public Integer Attack(Monster target){
        String message = attacker+ " uses melee attack on "+target;
        System.out.println(message);
        return attacker.getStr()-target.getDef();
    }



}
