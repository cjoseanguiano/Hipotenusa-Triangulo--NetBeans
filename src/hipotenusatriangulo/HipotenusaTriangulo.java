/*
Calcula la hipotenusa de un triangulo 
Formula -->  h2 = a2+ b2 
             H2 = A2+ b2 
 */
package hipotenusatriangulo;

import javax.swing.JOptionPane;

/**
 *
 * @author carlosjoseanguiano
 */
public class HipotenusaTriangulo {

    public static void main(String[] args) {

        double num_uno = 0;
        double num_dos = 0;
        double contA = num_uno;
        double contB = num_dos;
        double resultado = 0;
        double sumaAB;

        num_uno = Double.parseDouble(JOptionPane.showInputDialog("Ingresa A numero "));
        num_dos = Double.parseDouble(JOptionPane.showInputDialog("Ingresa B numero "));

        if (num_uno != 0 && num_dos != 0) {

            contA = num_uno * num_uno;
            contB = num_dos * num_dos;
            sumaAB = contA + contB;

            resultado = Math.sqrt(sumaAB);

            System.out.println("Resultado " + resultado);
        } else {
            System.out.println("Verifica el valor ingresado");
        }
    }

}
