/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cityofaaron;

/**
 *
 * @author German D. De Marco
 */
import java.io.Serializable;
public  enum TeamMember implements Serializable{
    
    
      memberOne("German D. De Marco")
   memberTwo("Nefi Verduga")
memberThree("Amosu Omoniyi");
    
    
    private String name;

    public String getName() {
        return name;
    }

    public String getTitle() {
        return title;
    }
    private String title;
    
    
    
}
