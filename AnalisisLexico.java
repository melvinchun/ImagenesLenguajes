package lenguajes;

public class AnalisisLexico {

    public static void main(String[] args) {
        //Es un nombre ilegal para un identificadores
        int @,;
        //Contiene caracteres invalidoso para un numero, por lo tanto, no esta formado correctamente
        int x=3,14;
        //Los acentos no estan dentro del voabulario del lenguajes
        int íú;
        //Erros de ortografia en palabras reservadas
        hwile{
            System.out.println("Hola mundo");
        }
    } 
}
