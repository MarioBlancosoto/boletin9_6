/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin9_6;

import javax.swing.JOptionPane;

/**
 *
 * @author Acer
 */
public class Sueldos {
    
    public void sueldos(){
        int trabTotales=0;
        int sueldo;
        int trabmas1000=0;
        int trabmenos1000=0;
        
        
       do{
        
                  do{
                      sueldo = Integer.parseInt(JOptionPane.showInputDialog("Inserte el sueldo de los trabajadores,no se permiten números negativos "));
                }while(sueldo<0);
                  
        
            
          
            if(sueldo>=1000&&sueldo<=1750){
           trabmas1000++;
           trabTotales++;     
             
                       
             }if (sueldo>0&&sueldo<1000){
                trabmenos1000++;
             trabTotales++;}
             System.out.println(" os traballadores de mais de 1000 e son "+trabmas1000+"\n e os traballadores "
                     + "e a porcentaxe de menos de 1000 e "+(trabmenos1000/trabTotales)*(100)+" %");
            
        }
        while(sueldo!=0);
       
  }
      
    }


