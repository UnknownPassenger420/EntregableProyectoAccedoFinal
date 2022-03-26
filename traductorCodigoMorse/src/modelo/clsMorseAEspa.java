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
public class clsMorseAEspa {
    String[] morse = {".-" ,"-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.." };
    String[] palabras = {"A", "B" , "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};

    String traduccion= " ";
    
    public String traducirxMorse(String dato){
        String[] palabra;
        
        palabra = dato.split(" ");
        
        for (int i=0; i<palabra.length; i++){
            for (int j=0; j<morse.length; j++){
                if (palabra[i].equals(morse[j])){
                    traduccion = traduccion + palabras[j]+ " ";
                }
            }
        }
        
        return traduccion; 
    }  

    String traducir(Object object, String showInputDialog) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
