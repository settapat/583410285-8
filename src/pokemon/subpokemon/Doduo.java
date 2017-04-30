/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pokemon.subpokemon;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.image.ImageObserver;
import javax.swing.ImageIcon;
import pokemon.*;
import skill.FuryAttack;
import skill.Peck;
import skill.QuickAttack;
import skill.Rage;
import skill.Skill;
import skill.SteelWing;
import skill.Tackle;
import skill.WingAttack;
/**
 *
 * @author Adminstartor
 */
public class Doduo extends Pokemon{
    
    public Doduo() {
        super("Doduo");
         gen = new Gender(0);
         type = new Type(Type.FLYING);
         img = new ImageIcon[2];
         skill = new Skill();
         
         this.setLevel(1);
         this.setHp(12+(level*3));
         this.setATK(7+(level*4));
         this.setDef(8+(level*2));
         this.setspAtk(5+(level*2));
         this.setspDef(6+(level*2));
         this.setBaseHP(12+(level*3));
         this.setGender(gen);
         this.setType(type);
         
         img[0] = new ImageIcon(pokemon.subpokemon.Doduo.class.getResource("Dodu//front.gif"));
         img[1] = new ImageIcon(pokemon.subpokemon.Doduo.class.getResource("Dodu//back.gif"));
         
         skill.addSkill(new Peck());
         skill.addSkill(new QuickAttack());
         skill.addSkill(new Rage());
         skill.addSkill(new FuryAttack());
    }

    @Override
    public void setLevel(int level) {
        super.setLevel(level); //To change body of generated methods, choose Tools | Templates.
        setBaseHP(12+(level*3));
    }
    
}