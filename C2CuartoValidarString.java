public class C2CuartoValidarString {
    public static void main (String [] args){

        //*Validar String:
        //-concat() solo usamos cuando hay una instancia, si hay null el programa se rompe. En cambio con el operador + se puede usar aunque el valor del String sea null
        // -Se puede validar con un if
        //-Si es nulo:
        String String1="";
        if(String1 == null){
            String1="valor defecto para null";
        }

        //-si es un String vacio ""
        boolean esVacio= String1.length() == 0;
        if(esVacio){
            String1="valor defecto para String vacio";
        }

        //Métodos
        String asdfas= "abcasfdfasHOLA";
        //  System.out.println(asdfas.isEmpty());
        System.out.println( asdfas.compareTo("fdgggggfdsfdgdg"));
        System.out.println(asdfas.substring(asdfas.length()-4));
        System.out.println(asdfas.substring(0,14));
        System.out.println(asdfas.length());

        /*
        C2*Métodos más importantes para String

            .length()
            .toUpperCase()
            .toLowerCase()

            .equals()
            .equalsIgnoreCase()
            .compareTo(): Comparación a orden lexicográfico. Devuelve 0 si son iguales. devuelve menos de 0 si el string que llama al método es menor al otro, y devuelve + si es mayor

            .charAt(int) transforma un String o parte de el a un caracter a partir de un int que hace referencia a la posicion de la letra en la cadena
            .subString(int,intOpcional) Obtiene subcadena sel string original, el int indica la posicion a partir de la cual se obtiene el substring o puede ir desde int a int usando 2 argumentos
            .replace("oldChar","newChar") retorna nuevo String con los caracteres reemplazados

            .indexOf("asd") Retorna la posicion de la primer ocurrencia de "asd" o de un caracter tmb
            .lastIndexOf("asd") Retorna la posicion de la Ultima ocurrencia de "asd" o de un caracter tmb
            .contains("siempreSecuenciauotroDentrode""") devuelve true si lo contiene

            .startsWith("lu") devuelve true si empieza con lu
            .endWinth("lu") similar al anterior

            .trim() Quita espacios en blanco de ambos lados

            .toCharArray(); Devuelve un array de caracteres de la cadena
            .split(" ") Devuelve un arreglo de sustrings, estos se separan a partir del caracter indicado com argumento
             En este caso todas las palabras separadas por espacio entran como substring, si usaramos "," todas las
             cadenas separadas por coma se separarian en substrings
             String1.split("a"), separa en arreglos de palabras separados por "a" == String [] arrrayS = ["hol","Ch","u"]
            - Para escapar caracteres como . que se usa en expresiones regulares podemos usar \\. y [.]


         */

    }
}
