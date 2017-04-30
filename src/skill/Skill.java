/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package skill;
import java.util.LinkedList;
/**
 *
 * @author Adminstartor
 */
public class Skill {
    LinkedList<SkillPlate> skill;
    
    public Skill() {
    skill = new LinkedList<SkillPlate>();
    }
    public LinkedList getSkill(){
        return skill;
    }
    public void addSkill(SkillPlate sk){
        skill.add(sk);
    }
    public boolean removeSkill(SkillPlate sk){
        for(int i = 0;i < skill.size();i++)
             if(skill.get(i) == sk){
                 skill.remove(i);
                 return true;
             }
        return false;
    }
}
