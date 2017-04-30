/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package skill;

import java.util.logging.Level;

/**
 *
 * @author Adminstartor
 */
public class SkillPlate {
    String name;
    int power;
    public SkillPlate(String name) {
      this.name = name;
    }
    public void setPow(int pow){
        this.power = pow;
    }
    public int getPow(){
        return power;
    }
    public String getName(){
        return name;
    }
}
