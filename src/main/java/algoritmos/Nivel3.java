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
public class Nivel3 {
    
     /** ALGORITMO 9 (int). Lee 10 enteros y determina el valor mayor y el valor menor,
     * inicializando ambos con el primer elemento del arreglo.
     */
    public static void algoritmo9(){
        int[] numeros = new int[10];
 
        for (int i = 0; i < numeros.length; i++) {
            String texto = JOptionPane.showInputDialog("ALGORITMO 9\nDeberá ingresar 10 números enteros\n\nIngrese el numero entero " + (i + 1) + ":");
            numeros[i] = Integer.parseInt(texto);
        }
 
        int mayor = numeros[0];
        int menor = numeros[0];
 
        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] > mayor) {
                mayor = numeros[i];
            }
            if (numeros[i] < menor) {
                menor = numeros[i];
            }
        }
 
        String mensaje = "Valor mayor: " + mayor + "\nValor menor: " + menor;
        JOptionPane.showMessageDialog(null, "ALGORITMO 9\n\n" + mensaje);
    } //Fin de algoritmo9()
    
    /** ALGORITMO 10 (int). Lee un arreglo ingressado por el usuario y solicita un numero a buscar. Si el número no se encuentra
     * dentro del arreglo se envia un mensaje (-1)
     */
    public static void algoritmo10(){
        int tamano;
        do{
            String textoTamano = JOptionPane.showInputDialog("ALGORITMO 10\nIngrese el tamaño del arreglo");
            tamano = Integer.parseInt(textoTamano);
        } while (tamano <= 0);
        
        int[] numeros = new int[tamano];
        for (int i = 0; i < numeros.length; i++){
            String texto = JOptionPane.showInputDialog("Ingrese el número " + (i + 1) + ":");
            numeros[i] = Integer.parseInt(texto);           
        }
        String numeroBuscado = JOptionPane.showInputDialog("Ingrese el número a buscar en el arreglo");
        int buscado = Integer.parseInt(numeroBuscado);
        
        int posicion = -1;
        for (int i = 0; i < numeros.length; i++){
            if (numeros[i] == buscado){
            posicion = i;
            break;
            }
        }
        String mensaje;
        if (posicion != -1){
            mensaje = "El número " + buscado + " se encontró en la posición " + posicion;
        } else {
            mensaje = "El número " + buscado + " NO EXISTE en el arreglo (-1)";
        }
        JOptionPane.showMessageDialog(null, "ALGORITMO 10\n\n" + mensaje);
    } //Fin de algoritmo10()
}
