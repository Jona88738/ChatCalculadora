/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistaCalculadora;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.Serializable;
import java.rmi.RemoteException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import paquete.Calculadora;
import paquete.implementacionOperaciones;

/**
 *
 * @author Jona xD
 */
public class ventana extends JFrame implements Serializable{
    
   public Calculadora cal;
    public implementacionOperaciones  lsd;
    
    JPanel pan = new JPanel();
     public  JTextField cuadro = new JTextField();
     public JButton boton1 = new JButton("1");
        JButton boton2 = new JButton("2");
        JButton boton3 = new JButton("3");
        JButton boton4 = new JButton("4");
        JButton boton5 = new JButton("5"); 
        JButton boton6 = new JButton("6"); 
        JButton boton7 = new JButton("7"); 
        JButton boton8 = new JButton("8"); 
        JButton boton9 = new JButton("9"); 
        JButton boton0 = new JButton("0");
        ventana vent ;
     //Calculadora cal;   
    public ventana() {
        
       
        pantalla();
        panel();
        cuadro.setBounds(0, 0, 500, 50);
        pan.add(cuadro);
        //cuadroEntrada();
        botonesPosicion();
        
        Boton1();
        btnSumar();
        vent = this;
       cal = new Calculadora(vent);
        
         //cal = new Calculadora(vent);
        
         //lsd = new implementacionOperaciones();
    }
    
    public void pantalla(){
        this.setSize(400,450);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setTitle("Calculadora");
        this.setLocationRelativeTo(null);
        
    }
    
    public void panel() {
        JLabel titulo = new JLabel();
        //titulo.setText("");
       // titulo.setBounds(500, 10, 150, 20);
        this.getContentPane().add(pan);
        pan.setLayout(null);
        pan.add(titulo);

    }
    public void cuadroEntrada(){
        
        cuadro.setBounds(0, 0, 500, 50);
        pan.add(cuadro);
        
    }
    JButton botonSuma = new JButton("Suma");
    public void botonesPosicion(){
        
        
        JButton botonResta = new JButton("Resta");
        JButton botonDivision = new JButton("Multiplicacion");
        JButton botonMultiplicacion = new JButton("Division");
        
        boton1.setBounds(0,55,80,100);
        boton2.setBounds(80,55,80,100);
        boton3.setBounds(160,55,80,100);
        
        botonSuma.setBounds(261, 55, 100, 100);
        
        boton4.setBounds(0,156,80,100);
        boton5.setBounds(80,156,80,100);
        boton6.setBounds(160,156,80,100);
        
        boton7.setBounds(0,260,80,100);
        boton8.setBounds(80,260,80,100);
        boton9.setBounds(160,260,80,100);
        
        boton0.setBounds(0,260,80,100);
        
        pan.add(boton1);
        pan.add(boton2);
        pan.add(boton3);
        pan.add(boton4);
        pan.add(boton5);
        pan.add(boton6);
        
        pan.add(boton7);
        pan.add(boton8);
        pan.add(boton9);
        
        pan.add(botonSuma);
        
    }
     public int varia=0;
     public  int  a;
     public int Boton1(){
         //int aux = 0;
          boton1.addActionListener(new ActionListener() {
              
              @Override
              public void actionPerformed(ActionEvent ae) {
                //cuadro.setText("1");
                //varia = 1;
                a = 1;
                
                  //System.out.println("Entro"+a);
                /*  
                try {
                     cal.servidor.num(vent);
                      
                      //lsd.num(1);
                  } catch (RemoteException ex) {
                      Logger.getLogger(ventana.class.getName()).log(Level.SEVERE, null, ex);
                  }
                  */
              }
          });
          //aux = varia;
          varia = a;
          
          a = 0;
      return varia;    
     }
     
     public void mostrar(String mensa){
         cuadro.setText(mensa);
     }
     
     
     
     static int ax = 0;
     
     public int btnSumar(){
         
         
         botonSuma.addActionListener(new ActionListener() {
              @Override
              public void actionPerformed(ActionEvent ae) {
               String operacion =cuadro.getText();
               a = 1;
               ax = 1;
                  System.out.println("se hizo "+a);
                  try {
                      System.out.println(cal.servidor.suma());
                      cuadro.setText(""+cal.servidor.suma());
                  } catch (RemoteException ex) {
                      Logger.getLogger(ventana.class.getName()).log(Level.SEVERE, null, ex);
                  }
               operacion +="+";
              }
          });

         return ax;
     }

  
    
}
