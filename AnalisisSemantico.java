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
        //Variable no inicializada
        int i;
        i++;
        //Diferentes tipos de variables
        int a="CHUN";
        //El operador - no esta sobre cargado para strings
        String s = "...";
        int a = 5 - s;
    }

    
    
}
