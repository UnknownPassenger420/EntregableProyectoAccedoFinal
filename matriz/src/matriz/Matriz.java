/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matriz;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class Matriz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int matriz[][], nFilas, nColumnas;
        Scanner entrada = new Scanner(System.in);
        
        nFilas = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese el numero de filas" ));
        nColumnas = Integer.parseInt(JOptionPane.showInputDialog(null, "Inserte el numero de columnas"));

        matriz = new int[nFilas][nColumnas];
        
        System.out.println("Digite la matriz:");
        for (int i=0;i<nFilas;i++){
            for(int j=0;j<nColumnas;j++){
                System.out.print("Matriz["+i+"]["+j+"]:");
                matriz[i][j] = entrada.nextInt();
        }
        }
        
        System.out.println("\nLa matriz es:");
        for (int i=0;i<nFilas;i++){
            for(int j=0;j<nColumnas;j++){
                System.out.print(matriz[i][j]);
        }
            System.out.println("");
        }
            
        }
    
}
