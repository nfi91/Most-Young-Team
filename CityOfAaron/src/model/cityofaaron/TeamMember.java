/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.cityofaaron;

/**
 *
 * @author German D. De Marco
 */
import java.io.Serializable;
public  enum TeamMember implements Serializable{
    
    
        memberOne("German", "De Marco"),
        memberTwo("Nefi", "Verduga"),
        memberThree("Amosu", "Omoniyi");
    
 TeamMember(String name, String title) {
      this.name = name;
      this.title = title;
    }
    
    private String name;

    public String getName() {
        return name;
    }

    public String getTitle() {
        return title;
    }
    private String title;
    
    
    
}
