/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lenguajes;

/**
 *
 * @author alvarez
 */
public class AnalisisSemantico {
    public static void main(String[] args) {
        int[] numeros = new int[4];
        //Aqui podemos observar dos errores semanticos uno es la x no declarada y el otro el 4 ya que excede el tamaño de array
        x=numeros[4];
        //Un entero no puede ser de tipo string
        int a="Chun";
        int b=a*b;
    }

    
    
}
