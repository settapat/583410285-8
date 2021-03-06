/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pokemon.subpokemon;
import javax.swing.ImageIcon;
import pokemon.*;
import skill.Bite;
import skill.*;
/**
 *
 * @author Adminstartor
 */
public class Pikachu extends Pokemon{

    public Pikachu() {
         super("Pikachu");
         gen = new Gender(0);
         type = new Type(Type.ELECTRIC);
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
         img[0] = new ImageIcon(pokemon.subpokemon.Rattata.class.getResource("Pickachu//front.gif"));
         img[1] = new ImageIcon(pokemon.subpokemon.Rattata.class.getResource("Pickachu//back.gif"));
         
         skill.addSkill(new QuickAttack());
         skill.addSkill(new Feint());
         skill.addSkill(new Spark());
         skill.addSkill(new Nuzzle());
    }

    @Override
    public void setLevel(int level) {
        super.setLevel(level); //To change body of generated methods, choose Tools | Templates.
        setBaseHP(12+(level*3));
    }
    
}
