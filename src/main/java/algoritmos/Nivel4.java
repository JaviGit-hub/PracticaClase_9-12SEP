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
public class Nivel4 {
    
    /** ALGORITMO 13 (int). Invierte un arreglo de enteros en el mismo arreglo, intercambiando
     * los elementos de los extremos y recorriendo solo hasta la mitad.
     */
    public static void algoritmo13(){
        int[] numeros = new int[10];
 
        for (int i = 0; i < numeros.length; i++) {
            String texto = JOptionPane.showInputDialog("ALGORITMO13\nIngrese el numero " + (i + 1) + ":");
            numeros[i] = Integer.parseInt(texto);
        }
 
        for (int i = 0; i < numeros.length / 2; i++) {
            int temp = numeros[i];
            numeros[i] = numeros[numeros.length - 1 - i];
            numeros[numeros.length - 1 - i] = temp;
        }
 
        String mensaje = "Arreglo invertido:\n";
        for (int valor : numeros) {
            mensaje += valor + " ";
        }
 
        JOptionPane.showMessageDialog(null, "ALGORITMO 13\n\n" + mensaje);
    } //Fin de algoritmo13()
    
    /** ALGORITMO 14 (int). Crea una copia independiente de un arreglo de 10 enteros, elemento
     * por elemento. Modifica la copia y comprueba que el original no cambia.
     */
    public static void algoritmo14(){
        int[] original = new int[10];
 
        for (int i = 0; i < original.length; i++) {
            String texto = JOptionPane.showInputDialog("ALGORITMO 14\nIngrese el numero entero " + (i + 1) + ":");
            original[i] = Integer.parseInt(texto);
        }
 
        int[] copia = new int[original.length];
        for (int i = 0; i < original.length; i++) {
            copia[i] = original[i];
        }
 
        // Se modifica la copia para comprobar que el original no cambia.
        for (int i = 0; i < copia.length; i++) {
            copia[i] = copia[i] * 2;
        }
 
        String mensajeOriginal = "Arreglo ORIGINAL (sin cambios): ";
        for (int valor : original) {
            mensajeOriginal += valor + " ";
        }
 
        String mensajeCopia = "Arreglo MODIFICADO (copia): ";
        for (int valor : copia) {
            mensajeCopia += valor + " ";
        }
 
        JOptionPane.showMessageDialog(null, "ALGORITMO 14\n\n" + mensajeOriginal + "\n" + mensajeCopia);
    } //Fin de algoritmo14()
    
    }
