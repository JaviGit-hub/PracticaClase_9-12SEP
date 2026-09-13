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
public class Nivel2 {

    /** ALGORITMO 5 (double). Lee 8 numeros decimales y calcula el promedio
     * general. Muestra el resultado con dos decimales.
     */
    public static void algoritmo5() {
        double[] numeros = new double[8];
        double suma = 0;

        for (int i = 0; i < numeros.length; i++) {
            String texto = JOptionPane.showInputDialog("ALGORITMO 5\nIngrese el numero decimal " + (i + 1) + ":");
            numeros[i] = Double.parseDouble(texto);
            suma += numeros[i];
        }

        double promedio = suma / numeros.length;

        JOptionPane.showMessageDialog(null, "ALGORITMO 5\n\nEl promedio general (2 decimales) es: "
                + String.format("%.2f", promedio));
    } //Fin de algoritmo5()
    
    /** ALGORITMO 6 (double). Usa un arreglo de 20 valores booleanos para representar asistencia.
     * Calcula cuantos asistieron, cuantos faltaron y el porcentaje de asistencia.
     */
    public static void algoritmo6() {
        boolean[] asistencia = new boolean[20];
 
        for (int i = 0; i < asistencia.length; i++) {
            String texto = JOptionPane.showInputDialog("ALGORITMO 6\n¿Asistió el estudiante " + (i + 1) + "? (Escribe true/false):");
            asistencia[i] = Boolean.parseBoolean(texto);
        }
 
        int asistieron = 0;
        int faltaron = 0;
        for (int i = 0; i < asistencia.length; i++) {
            if (asistencia[i]) {
                asistieron++;
            } else {
                faltaron++;
            }
        }
 
        double porcentaje = (asistieron * 100.0) / asistencia.length;
 
        String mensaje = "Asistieron: " + asistieron + " estudiantes"
                + "\nFaltaron: " + faltaron + " estudiantes"
                + "\n\nPorcentaje de asistencia: " + String.format("%.2f", porcentaje) + "%";
 
        JOptionPane.showMessageDialog(null, "ALGORITMO 6\n\n" + mensaje);
    } //Fin de algoritmo6()
}
