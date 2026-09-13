/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package algoritmos;
import javax.swing.JOptionPane;

/**
 *
 * @author Javier MT
 */
public class Nivel1 {
    
     /** ALGORITMO 1 (double). Arreglo de 4 numeros decimales inicializado con valores literales. 
     * Muestra la longitud del arreglo y el ultimo elemento.
     */
    public static void algoritmo1() {
        double[] numeros = {3.5, 7.2, 1.8, 9.4};
 
        String mensaje = "Longitud del arreglo: " + numeros.length
                + "\nUltimo elemento: " + numeros[numeros.length - 1];
 
        JOptionPane.showMessageDialog(null, "ALGORITMO 1\n\n" + mensaje);
    } //Fin de algoritmo1()
    
    /** ALGORITMO 2 (boolean). Arreglo de 6 valores booleanos que muestra el valor
     * almacenado en cada posicion usando un ciclo for.
     */
    public static void algoritmo2() {
        boolean[] valores = {true, false, true, true, false, false};
 
        String mensaje = "";
        for (int i = 0; i < valores.length; i++) {
            mensaje += "Posicion " + i + ": " + valores[i] + "\n";
        }
 
        JOptionPane.showMessageDialog(null, "ALGORITMO 2\n\n" + mensaje);
    } //Fin de algoritmo2()
}
