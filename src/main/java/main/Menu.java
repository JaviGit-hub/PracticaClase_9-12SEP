/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;
import javax.swing.JOptionPane;
import algoritmos. *;

/** Permite el acceso a los diferentes niveles y llama a los métodos correspondientes a cada algoritmo.
 *
 * NOTA: al ser una entrega individual, solo se implementaron 2
 * algoritmos por nivel (los numeros 1, 2, 5, 6, 9, 10, 13, 14, 17 y 19
 * del enunciado original).
 * @author Javier MT
 */
public class Menu {
   
    public static void mostrarMenu(){
        int opcion;
        
        do {
            opcion = Integer.parseInt(JOptionPane.showInputDialog("======= MENÚ PRINCIPAL =======\n"
            + "Acceso a diferentes algoritmos por nivles\n\n"
            + "1. Nivel 1 - Fundamentos\n"
            + "2. Nivel 2 - Recorridos y acumulación\n"
            + "3. Nivel 3 - Búsqueda y condiciones\n"
            + "4. Nivel 4 - Transformación de arreglos\n"
            + "5. Nivel 5 - Integraciones avanzadas\n"
            + "Digite 0 para SALIR\n\n"
            + "Seleccione una opción"));
            
            switch (opcion){
                case 1: menuNivel1(); break;
                case 2: menuNivel2(); break;
                case 3: menuNivel3(); break;
                case 4: menuNivel4(); break;
                case 5: menuNivel5(); break;
                case 0: JOptionPane.showMessageDialog(null, "Saliendo del programa ..."); break;
                default: JOptionPane.showMessageDialog(null, "ERROR\nOpción inválida. Intente nuevamente");
            }   
        }while (opcion != 0);
    } //Fin de mostrarMenu
    
     private static void menuNivel1() {
        int opcion;
        do {
            opcion = Integer.parseInt(JOptionPane.showInputDialog("--- Nivel 1 - Fundamentos ---\n"                 
                    + "1. Algoritmo 1: Arreglo de 4 decimales literales\n" 
                    + "2. Algoritmo 2: Arreglo de 6 booleano\n" 
                    + "0. Volver al menu principal"));
 
            switch (opcion) {
                case 1:
                    Nivel1.algoritmo1();
                    break;
                case 2:
                    Nivel1.algoritmo2();
                    break;
                case 0:
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opcion invalida.");
            }
        } while (opcion != 0);
    } //Fin de menuNivel1
 
    private static void menuNivel2() {
        int opcion;
        do {
            opcion = Integer.parseInt(JOptionPane.showInputDialog("--- Nivel 2 - Recorridos y acululación ---\n"                 
                    + "1. Algoritmo 5: Promedio de 8 numeros decimales\n" 
                    + "2. Algoritmo 6: Asistencia con arreglo de 20 booleanos\n" 
                    + "0. Volver al menu principal"));
            
            switch (opcion) {
                case 1:
                    Nivel2.algoritmo5();
                    break;
                case 2:
                    Nivel2.algoritmo6();
                    break;
                case 0:
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opcion invalida.");
            }
        } while (opcion != 0);
    } //Fin de menuNIvel2
 
    private static void menuNivel3() {
        int opcion;
        do {
            opcion = Integer.parseInt(JOptionPane.showInputDialog("--- Nivel 3 - Búsqueda y condiciones ---\n"                 
                    + "1. Algoritmo 9: Máximo y mínimo de 10 enteros\n" 
                    + "2. Algoritmo 10: Búsqueda lineal\n" 
                    + "0. Volver al menu principal"));
            
            switch (opcion) {
                case 1:
                    Nivel3.algoritmo9();
                    break;
                case 2:
                    Nivel3.algoritmo10();
                    break;
                case 0:
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opcion invalida.");
            }
        } while (opcion != 0);
    } //Fin de menuNivel3()
 
    private static void menuNivel4() {
        int opcion;
        do {
            opcion = Integer.parseInt(JOptionPane.showInputDialog("--- Nivel 4 - Transformación de arreglos ---\n"                 
                    + "1. Algoritmo 13: Invertir arreglo de enteros\n" 
                    + "2. Algoritmo 14: Copia independiente de arreglo\n" 
                    + "0. Volver al menu principal"));
            
            switch (opcion) {
                case 1:
                    Nivel4.algoritmo13();
                    break;
                case 2:
                    Nivel4.algoritmo14();
                    break;
                case 0:
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opcion invalida.");
            }
        } while (opcion != 0);
    } //Fin de menuNivel4()
 
    private static void menuNivel5() {
        int opcion;
        do {
            opcion = Integer.parseInt(JOptionPane.showInputDialog("--- Nivel 5 - Integraciones avanzadas ---\n"                 
                    + "1. Algoritmo 17: Suma de dos arreglos paralelos\n" 
                    + "2. Algoritmo 19: Verificar si un arreglo esta ordenado\n" 
                    + "0. Volver al menu principal"));
           
            switch (opcion) {
                case 1:
                    Nivel5.algoritmo17();
                    break;
                case 2:
                    Nivel5.algoritmo19();
                    break;
                case 0:
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opcion invalida.");
            }
        } while (opcion != 0);
    } //Fin de menuNivel5()


    
    
    
    
}
