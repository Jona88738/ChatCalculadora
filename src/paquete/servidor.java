/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

/**
 *
 * @author Jona xD
 */
public class servidor {
    
    
    public static void main(String[] args)  {
        
        try{
            
            //java.rmi.registry.LocateRegistry.createRegistry(1099);
            
            //Naming.rebind("//192.168.137.164/Chat", new implementacionOperaciones());
            //System.out.println("Servidor de chat listo.");
            
            
            
            
            
            //Registry r = java.rmi.registry.LocateRegistry.createRegistry(1099);
            //r.bind("Ope",(Remote) new implementacionOperaciones());
            
            
            
            
            //Socket creat = new Socket("10.0.2.15",5000);
            //ServerSocket serve = new ServerSocket(5000);192.168.100.6
            
            System.setProperty("java.rmi.server.hostname","192.168.100.6");
            Registry rmi = LocateRegistry.createRegistry(1099);
            
            System.out.println("ahora");
            /*
            System.setProperty("java.rmi.server.useCodebaseOnly", "false");
           if (System.getSecurityManager() == null) {
    System.setSecurityManager(new SecurityManager());
}*/
            //servidorRMI servi = new servidorRMI();
            
            //Naming.rebind("//localhost/Chat",(Remote) new implementacionChat());
            //implementacionChat im =  (implementacionChat)  UnicastRemoteObject.exportObject(servi, 0);
             //impor
           rmi.rebind("Chat",(Remote) new implementacionOperaciones());
            System.out.println("Servidor Activo");
        } catch  (RemoteException e){
        }
    }
    
}
