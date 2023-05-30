/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete;

import java.io.Serializable;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import javax.swing.JTextField;
import vistaCalculadora.ventana;

/**
 *
 * @author Jona xD
 */
public class Calculadora  {
    
    public static Operaciones servidor ;
    public static ventana ven;
    
    public Calculadora(ventana vent){
        
        try{
            ven = vent;
            //servidor  = (Operaciones) Naming.lookup("//192.168.137.164/Chat");
            //System.out.println("Conectado al servidor de chat.");
            
            
            
            //Registry rmi = LocateRegistry.getRegistry("192.168.100.6",1099);
             
             //servidor = (Operaciones)rmi.lookup("Chat");
             //this.ven.cuadro.setText("Hola");
             //int var = servidor.num(vent);
             //vent.cuadro.setText(" "+var);
             //servidor.num(12, vent);
             
           //System.out.println("entro");
        //Registry r = LocateRegistry.getRegistry("localhost",1099);
            //Operaciones servidor = (Operaciones) Naming.lookup("//192.168.100.6/Chat");
            
            /*
           System.setProperty("java.rmi.server.useCodebaseOnly", "false");
           if (System.getSecurityManager() == null) {
    System.setSecurityManager(new SecurityManager());
}*/
            //  localhost
            //Registry rmi = LocateRegistry.getRegistry("192.168.137.44",5000);10.0.2.15
           
            Registry rmi = LocateRegistry.getRegistry("192.168.100.6",1099);
             
         servidor = (Operaciones) rmi.lookup("Chat");
          
           System.out.println("entro");
          
          // servidor.num(5);

           
            new Thread( new impleusuaioCalculadora(servidor,ven)).start();
        } catch(Exception e){
            System.out.println(e.getMessage());
        }
        
    }
    
    
    public static void main(String[] args) {
        try{
        // /*
        
       
           
            Registry rmi = LocateRegistry.getRegistry("192.168.100.6",1099);
             
         servidor = (Operaciones) rmi.lookup("Chat");
          
           System.out.println("entro");
          
          // servidor.num(5);

           
            new Thread( new impleusuaioCalculadora(servidor,ven)).start();
            
            
            
            
            
            
            
            
         //   */
                   
        } catch(Exception e){
            System.out.println(e.getMessage());
        }
    
    }
}
