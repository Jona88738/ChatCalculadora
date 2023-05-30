/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistaCalculadora;

import java.rmi.RemoteException;
import paquete.Calculadora;

/**
 *
 * @author Jona xD
 */
public class main {
    
        
     public static void main(String[] args) throws RemoteException {
         ventana vent = new ventana();
         vent.setVisible(true);
         
     }
}
