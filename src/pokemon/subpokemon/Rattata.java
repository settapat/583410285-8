/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pokemon.subpokemon;
import java.awt.Image;
import javax.swing.ImageIcon;
import pokemon.*;
import skill.Bite;
import skill.Pursuit;
import skill.QuickAttack;
import skill.Skill;
import skill.Tackle;
/**
 *
 * @author Adminstartor
 */
public class Rattata extends Pokemon{

    public Rattata() {
         super("Rattata");
         gen = new Gender(0);
         type = new Type(Type.NORMAL);
         img = new ImageIcon[2];
         skill = new Skill();
         
         this.setLevel(1);
         this.setHp(12+(level*3));
         this.setATK(7+(level*4));
         this.setDef(8+(level*2));
         this.setspAtk(5+(level*2));
         this.setspDef(6+(level*2));
         this.setGender(gen);
         this.setType(type);
         
         img[0] = new ImageIcon(pokemon.subpokemon.Rattata.class.getResource("Rattata//front.gif"));
         img[1] = new ImageIcon(pokemon.subpokemon.Rattata.class.getResource("Rattata//back.gif"));
         
         skill.addSkill(new Tackle());
         skill.addSkill(new QuickAttack());
         skill.addSkill(new Bite());
         skill.addSkill(new Pursuit());
    }    

    @Override
    public void setLevel(int level) {
        super.setLevel(level); //To change body of generated methods, choose Tools | Templates.
        setBaseHP(12+(level*3));
    }
    
}
