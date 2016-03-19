/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.piratesOfTheOpenSeas.exceptions;

/**
 *
 * @author Roderick
 */
public class SailControlExceptions extends Exception {

    public SailControlExceptions() {
    }

    public SailControlExceptions(String string) {
        super(string);
    }

    public SailControlExceptions(String string, Throwable thrwbl) {
        super(string, thrwbl);
    }

    public SailControlExceptions(Throwable thrwbl) {
        super(thrwbl);
    }

    public SailControlExceptions(String string, Throwable thrwbl, boolean bln, boolean bln1) {
        super(string, thrwbl, bln, bln1);
    }
    
    
    
}
