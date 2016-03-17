/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.piratesOfTheOpenSeas.exceptions;

/**
 *
 * @author Liz
 */
public class InventoryControlException extends Exception {

    public InventoryControlException() {
    }

    public InventoryControlException(String message) {
        super(message);
    }

    public InventoryControlException(String message, Throwable cause) {
        super(message, cause);
    }

    public InventoryControlException(Throwable cause) {
        super(cause);
    }

    public InventoryControlException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
    
    
    
}
