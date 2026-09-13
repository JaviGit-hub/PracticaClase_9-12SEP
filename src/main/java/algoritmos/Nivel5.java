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
public class Nivel5 {
    
    /** ALGORITMO 17 (int). Crea dos arreglos de igual tamano. Genera un tercer arreglo donde
     * cada posicion es la suma de los elementos correspondientes de los
     * dos arreglos originales.
     */
    public static void algoritmo17(){
        int tamano;
        do {
            String textoTamano = JOptionPane.showInputDialog("ALGORITMO 10\nIngrese el tamaño de los arreglos:");
            tamano = Integer.parseInt(textoTamano);
        } while (tamano <= 0);
 
        int[] arregloA = new int[tamano];
        int[] arregloB = new int[tamano];
        int[] suma = new int[tamano];
 
        for (int i = 0; i < arregloA.length; i++) {
            String texto = JOptionPane.showInputDialog("PRIMER ARREGLO - valor " + (i + 1) + ":");
            arregloA[i] = Integer.parseInt(texto);
        }
 
        for (int i = 0; i < arregloB.length; i++) {
            String texto = JOptionPane.showInputDialog("SEGUNDO ARREGLO - valor " + (i + 1) + ":");
            arregloB[i] = Integer.parseInt(texto);
        }
 
        for (int i = 0; i < suma.length; i++) {
            suma[i] = arregloA[i] + arregloB[i];
        }
 
        String mensaje = "Sumatoria de los valores en los arreglos:\n";
        for (int valor : suma) {
            mensaje += valor + " ";
        }
        JOptionPane.showMessageDialog(null, "ALGORITMO 17\n\n" + mensaje);
    } //Fin de algoritmo17()
    
    /** ALGORITMO 19 (int). Lee un arreglo y determina si esta ordenado de forma ascendente,
     * sin modificarlo
     */
    public static void algoritmo19(){
        int tamano;
        do {
            String textoTamano = JOptionPane.showInputDialog("ALGORITMO 19\nIngrese el tamaño del arreglo");
            tamano = Integer.parseInt(textoTamano);
        } while (tamano <= 0);
 
        int[] numeros = new int[tamano];
        for (int i = 0; i < numeros.length; i++) {
            String texto = JOptionPane.showInputDialog("Ingrese el numero " + (i + 1) + ":");
            numeros[i] = Integer.parseInt(texto);
        }
 
        boolean ordenado = true;
        for (int i = 0; i < numeros.length - 1; i++) {
            if (numeros[i] > numeros[i + 1]) {
                ordenado = false;
                break;
            }
        }
        String valoresIngresados = "VALORES INGRESADOS ";
        for (int valor : numeros) {
            valoresIngresados += valor + " ";
        }
 
        String resultado;
        if (ordenado) {
            resultado = "El arreglo esta ordenado de forma ascendente.";
        } else {
            resultado = "El arreglo NO esta ordenado de forma ascendente.";
        }
        String mensaje = resultado + "\n" + valoresIngresados;
        
        JOptionPane.showMessageDialog(null, "ALGORITMO 19\n\n" + mensaje);
    } //Fin de algoritmo19()
}
