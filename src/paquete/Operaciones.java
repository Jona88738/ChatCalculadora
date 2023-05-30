/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete;

import java.rmi.Remote;
import java.rmi.RemoteException;
import javax.swing.JTextField;
import vistaCalculadora.ventana;

/**
 *
 * @author Jona xD
 */
public interface Operaciones extends Remote {
    public int num(int num) throws RemoteException;
    void EnviarMensaje(String mensaje) throws RemoteException;
    int suma() throws RemoteException;
    int resta(int num1,int num2) throws RemoteException;
    public void usuarios(usuarios aux) throws RemoteException;
    String numm() throws RemoteException;
}
