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
        int x;
        x++;
        //Diferentes tipos de variables
        int b="CHUN";
        //El operador - no esta sobre cargado para strings
        String t = "...";
        int r = 5 - t;
    }

    
    
}
