/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cityofaaron;

/**
 *
 * @author German De Marco
 */
import java.io.Serializable;
public class Game implements Serializable {

  
    private Player  thePlayer;

    public Player getThePlayer() {
        return thePlayer;
    }

    public void setThePlayer(Player thePlayer) {
        this.thePlayer = thePlayer;
    }

    public Game(Player thePlayer) {
        this.thePlayer = thePlayer;
    }
    
    
 
}
