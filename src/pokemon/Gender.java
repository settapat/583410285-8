/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pokemon;

import java.awt.Toolkit;
import javax.swing.ImageIcon;

/**
 *
 * @author Adminstartor
 */
public class Gender {
    public final int MALE = 0,FEMALE = 1;
    int gender;
    ImageIcon img;
    
    public Gender(int gender) {
       this.gender = gender;   
    }
    public ImageIcon getImage(){
       if(gender == MALE)
           img = new ImageIcon(pokgame.PokGame.class.getResource("gender//maleIcon.png"));
       else if(gender == FEMALE)
           img = new ImageIcon(pokgame.PokGame.class.getResource("gender//femaleIcon.png"));
      return (img != null)? img : null;
    }
    public int getGender(){
        return gender;
    }
    public void setGender(int gender){
        this.gender = gender;
    }
    public  void setGender(Gender gen){
        gender = gen.getGender();
    }
    private String convertToString(int gender){
        String gen;
        switch(gender){
            case 0 : gen = "MALE"; break;
            case 1 : gen = "FEMALE"; break;
            default: return null;
        }
        return  gen;
    }
    public String toString() {
        return convertToString(gender);
    }
    
}
