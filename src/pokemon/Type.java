/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pokemon;

/**
 *
 * @author Adminstartor
 */
public class Type {
    public static final int NORMAL = 0,FIGHTING = 1,FLYING = 2,POISON = 3,GROUND = 4,ROCK = 5,BUG = 6,GHOST = 7,STEEL = 8,FIRE = 9,WATER = 10,GRASS = 11,ELECTRIC = 12,PSYCHIC = 13,ICE = 14,DRAGON = 15,DARK = 16,FAIRY = 17,NA = 18;
    int type;  
    public Type(int type) {
      this.type = type;
    }
    public void setType(int type){
        this.type = type;
    }
    public int  getType(){
        return type;
    }
    public void setType(Type type){
       this.type = type.getType();
    }
    private String convertToString(int type){
       String st;
       switch(type){
           case 0 : st = "NORMAL"; break;
           case 1 : st = "FIGHTING"; break;
           case 2 : st = "FLYING"; break;
           case 3 : st = "POISON"; break;
           case 4 : st = "GROUND"; break;
           case 5 : st = "ROCK"; break;
           case 6 : st = "BUG"; break;
           case 7 : st = "GHOST"; break;
           case 8 : st = "STEEL"; break;
           case 9 : st = "FIRE"; break;
           case 10 : st = "WATER"; break;
           case 11 : st = "GRASS"; break;
           case 12 : st = "ELECTRIC"; break;
           case 13 : st = "PSYCHIC"; break;
           case 14 : st = "ICE"; break;
           case 15 : st = "DRAGON"; break;
           case 16 : st = "DARK"; break;
           case 17 : st = "FAIRY"; break;
           case 18 : st = "NA"; break;
           default: return null;
       }          
       return st;
    }   
    public  String toString() {
        return convertToString(type);
    }
}
