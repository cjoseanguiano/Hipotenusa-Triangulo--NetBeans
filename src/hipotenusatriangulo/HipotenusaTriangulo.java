/*
Calcula la hipotenusa de un triangulo 
Formula -->  h2 = a2+ b2 
 */
package hipotenusatriangulo;

import javax.swing.JOptionPane;

/**
 *
 * @author carlosjoseanguiano
 */
public class HipotenusaTriangulo {

    public static void main(String[] args) {

        double num_uno;
        double num_dos;
        double mihipotenusa = 0;

        num_uno = Double.parseDouble(JOptionPane.showInputDialog("Ingresa A numero "));
        num_dos = Double.parseDouble(JOptionPane.showInputDialog("Ingresa B numero "));

        if (num_uno != 0 && num_dos != 0) {
            HipotenusaTriangulo hipotenusaTriangulo = new HipotenusaTriangulo();
            mihipotenusa = hipotenusaTriangulo.hipotenusa(num_uno, num_dos);
            JOptionPane.showMessageDialog(null, mihipotenusa);

        } else {
            JOptionPane.showMessageDialog(null, "Verifica el valor ingresado");
        }
    }

    public static double hipotenusa(double valorA, double valorB) {
        double hipotenusa;
        double resul;
        resul = valorA * valorA + valorB * valorB;
        hipotenusa = Math.sqrt(resul);
        return hipotenusa;

    }

}
