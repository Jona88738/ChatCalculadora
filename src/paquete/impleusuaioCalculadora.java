/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete;

import java.awt.event.ActionListener;
import java.io.Serializable;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import vistaCalculadora.ventana;

/**
 *
 * @author Jona xD
 */
public class impleusuaioCalculadora extends UnicastRemoteObject implements Runnable,usuarios {
    ventana  ven;
    ArrayList<ventana> s;
    Operaciones se;
    //impleusuaioCalculadora la = this;
    public impleusuaioCalculadora(Operaciones ser,ventana vent) throws RemoteException {
        //s = new <ventana>ArrayList();
        ven = vent;
        //this.vent.cuadro.setText("Texto no paso ");
       se = ser;
       //System.out.println("1");
       se.usuarios(this);
        //System.out.println("2");
      
      // s.add(vent);
       //vent.cuadro.setText("Ejemplo");
      // vent.setVisible(true);
       
      //s.get(0).cuadro.setText("HOOla");
    }
    
    public void  mostrar(String mensaje){
        System.out.println("Hoola ");
    }

    
    
    boolean aux = true;
    
    
    @Override
    public void run() {
       
        while(true){
            Scanner s = new Scanner(System.in);
            String opcion;
            opcion = s.nextLine();
            try {
                se.num(Integer.parseInt(opcion));
            } catch (RemoteException ex) {
                Logger.getLogger(impleusuaioCalculadora.class.getName()).log(Level.SEVERE, null, ex);
            } 
            /*
            if(ven.Boton1()== 1 && aux){
                //System.out.println("una vez");
                //aux = false;
                int auxx;
                ven.varia = 0;
                try {
                    //this.wait(1000);
                    
                    auxx = se.num(4);
                    //System.out.println(auxx);
                    //aux = true;
                    Thread.sleep(80000);
                 } catch (RemoteException ex) {
                    Logger.getLogger(impleusuaioCalculadora.class.getName()).log(Level.SEVERE, null, ex);
                } catch (InterruptedException ex) {
                    Logger.getLogger(impleusuaioCalculadora.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            */
        }
    }

    
    @Override
    public void RecibirMensaje(String mensaje) throws RemoteException {
        System.out.println(mensaje);
         }
    
}
