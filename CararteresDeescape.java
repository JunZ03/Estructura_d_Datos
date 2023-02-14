/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cararteres.deescape;

import javax.swing.JOptionPane;

/**
 *
 * @author B11
 */
public class CararteresDeescape {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num;
        String mensaje = ("Introduce un numero entre 0 y 10");
do {
            String texto = JOptionPane.showInputDialog(mensaje);
            num = Integer.parseInt(texto);
        } while (num >= 10 || num < 0);
        System.out.println("El numero introducido es " + num);
    }

}
