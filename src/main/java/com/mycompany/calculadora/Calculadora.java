
package com.mycompany.calculadora;
import javax.swing.JOptionPane;

/**
 *
 * @author LENOVO
 */
public class Calculadora {



   
    public static void main(String[] args) {
    
   
    int Menu=Integer.parseInt(JOptionPane.showInputDialog(null, " 1.Tipo de operacion\n  2.Salir"));
    switch (Menu){
        case 1 -> JOptionPane.showInputDialog(null, "Tipo de operacion");
        case 2 -> JOptionPane.showInputDialog(null, "Salir");
        default -> JOptionPane.showMessageDialog(null, "Opcion INCORRECTA");

    }
    int Operacion=Integer.parseInt(JOptionPane.showInputDialog(null, "Tipo de operacion\n 1.Suma\n 2.Resta\n 3.Multiplicacion\n 4.Division\n 5.Potencia\n 6.Raiz cuadrada\n 7.Salir"));
String a = JOptionPane.showInputDialog("Ingrese un numero");   
String b = JOptionPane.showInputDialog("Ingrese un numero"); 

double n1 = Double.parseDouble(a); 
double n2 = Double.parseDouble(b);  

    switch (Operacion){
        case 1 -> {
            double Suma = n1 + n2;
            JOptionPane.showMessageDialog(null,Suma);
            }
        case 2 -> {
            double Resta = n1 - n2;
            JOptionPane.showMessageDialog(null,Resta);
            }
        case 3 -> {
            double Mul = n1 * n2;
            JOptionPane.showMessageDialog(null,Mul);
            }
        case 4 -> {
            double Division = n1 / n2;
            JOptionPane.showMessageDialog(null,Division);
            }    
        case 5 -> {
            double numero1 = n1;
            double Potencia = Math.pow(numero1, 2);            
            JOptionPane.showMessageDialog(null,Potencia);
            } 
        case 6 -> {
            double RaizCuadrada = Math.sqrt(n1);
            JOptionPane.showMessageDialog(null,RaizCuadrada);
            } 
        case 7 -> JOptionPane.showInputDialog(null, "Salir");
        default -> JOptionPane.showMessageDialog(null, "Opcion INCORRECTA");   
           
     }
    }

   }
