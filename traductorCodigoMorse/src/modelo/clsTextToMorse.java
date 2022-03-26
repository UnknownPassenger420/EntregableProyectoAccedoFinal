/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;
/**
 *
 * @author Usuario
 */
public class clsTextToMorse {
    
    
    String[] morse = {".-" ,"-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.." };
    String[] palabras = {"A", "B" , "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};

    String traduccion= " ";
    public String traducir (String dato){
         String traduccion = "";
         String mayuscula = "";
         String letra = "";
         
         mayuscula = dato.toUpperCase();
         
         for (int i=1; i<=dato.length(); i++){
             
                letra = mayuscula.substring(i-1, i);
             
             for (int j=0; j<palabras.length; j++){
                if (letra.equals(palabras[j])){
                    traduccion = traduccion + morse[j] + " | ";
                }
             }
         } 
         return traduccion;
    }

    String traducir(Object object, String showInputDialog) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
