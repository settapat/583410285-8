/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pokemon;

import javax.swing.ImageIcon;
import skill.*;
import java.util.LinkedList;
/**
 *
 * @author Adminstartor
 */
public class Pokemon {
    
    protected String name;
    protected Gender gen;
    protected ImageIcon[] img; 
    protected int hp,def,atk,spAtk,spDef;
    protected int baseHp;
    protected Skill skill;
    protected Type type;
    protected int level;
    
    public Pokemon(String name){
       this.name = name;
    }
    
    public void setHp(int hp){
        this.hp = hp;
    }
    
    public void setDef(int def){
        this.def = def;
    }
    
    public  int getHp(){
        return hp;
    }
    public  int getDef(){
        return def;
    }
    public int getType(){
       return type.getType();
    }
    public void setType(int type){
      this.type.setType(type);
    }
    public void setType(Type type){
      this.type.setType(type);
    }
    public void setATK(int atk){
        this.atk = atk;
    }
    public int getATK(){
        return atk;
    }
    public int getGender(){
        return gen.getGender();
    }
    public Gender getGender2(){
        return gen;
    }
    public void setGender(int gender){
        this.gen.setGender(gender);
    }
    public void setGender(Gender gen){
        this.gen.setGender(gen);
    }
    public void setLevel(int level){
        this.level = level;
    }
    public int getLevel(){
        return level;
    }
    public int getSpAtk(){
        return spAtk;
    }
    public void setspAtk(int spAtk){
        this.spAtk = spAtk;
    }
    public int getSpDef(){
        return this.spDef;
    }                   
    public void setspDef(int spdf){
        this.spDef = spdf;
    }
    public String getName(){
        return name;
    }
    public ImageIcon getImage(int num){
        return img[num];
    }
    public LinkedList<SkillPlate> getLinklist(){
        return skill.getSkill();
    }
    public void setBaseHP(int basehp){
       this.baseHp = basehp;
    }
    public int getBaseHP(){
      return this.baseHp;
    }
   
}
