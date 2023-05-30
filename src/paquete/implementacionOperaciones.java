/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import javax.swing.JTextField;
import vistaCalculadora.ventana;

/**
 *
 * @author Jona xD
 */
public class implementacionOperaciones extends UnicastRemoteObject implements Operaciones {

    int num1,num2;
     
     public static ArrayList<usuarios> user;
    
     public int nn=0;
    public implementacionOperaciones() throws RemoteException{
       super();
        //clientes = new ArrayList<>();
        //field = new ArrayList<>();
        user = new ArrayList<>();
         //op = new ArrayList<Operaciones>();
        //clientes.add(1);
        //clientes.add(2);
    }
    @Override
    public int suma() throws RemoteException {
        //System.out.println("El resultado: "+(clientes.get(0)+clientes.get(1)));
        //field.get(0).cuadro.setText("12");
        //field.get(1).cuadro.setText("12");
        return 32;// (clientes.get(0)+clientes.get(1));
    }

    @Override
    public int resta(int num1, int num2) throws RemoteException {
        return 1;
    }

    @Override
    public int num(int num) throws RemoteException {
         //clientes.add(num);
        // field.add(vent);
        // fiel.setText("Esto es el cuadro de TExto");
         //vent.cuadro.setText("fdso");
         //System.out.println("Entroo objeto remoto");
         int a = 0;
        while(a < user.size()){
           user.get(a++).RecibirMensaje("definifivo"+num);
       }
         /*
         int a = 0;
        while(a < user.size()){
           user.get(a++).mensaje("HOola");
       }
         */
         //fie.cuadro.setText("TExto inicial");
         //fie.cuadro.setText();
         //System.out.println("El tamaño es: "+field.size());
        return num;
    }

    @Override
    public String numm() throws RemoteException {
        
        return "";
    }
    
    public void n(int num,ventana vent){
        
    }

    @Override
    public void usuarios(usuarios aux) throws RemoteException {
        System.out.println("xD");
        user.add(aux);
        //aux.mensaje("hola");
        //op.add(aux);
        //aux.mostrar("Hola");
        //op.add(aux);
        /*
        int a = 0;
        System.out.println("guardo usuario"+op.size());
        while(a < op.size()){
           op.get(a++).mostrar("guardo bien");
       }
        */
        
        
    }

    @Override
    public void EnviarMensaje(String mensaje) throws RemoteException {
        
            int a = 0;
        while(a < user.size()){
           user.get(a++).RecibirMensaje(mensaje);
       }
         }
    
}
