/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class clsMain {   
    
    public static void main(String[] args){
       clsTextToMorse traduccion = new clsTextToMorse();
       clsMorseAEspa trad = new clsMorseAEspa();
       byte tipotrad = 0;
       
       tipotrad = Byte.parseByte(JOptionPane.showInputDialog(null, "Ingrese 1 para traducir de texto a Morse, 2 Para Morse a Texto"));
       
       if (tipotrad ==1 ){
        String palabrasRes = ""; 
        palabrasRes = traduccion.traducir("Olabuenastardes");
        System.out.println(palabrasRes); 
       }
       else if (tipotrad==2){
        String palabrasRes = ""; 
        palabrasRes = trad.traducirxMorse(".... --- .-.. .-");
        System.out.println(palabrasRes);
       }
   }
}
