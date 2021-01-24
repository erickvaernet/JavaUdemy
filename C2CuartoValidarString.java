public class C2CuartoValidarString {
    public static void main (String [] args){

        //*Validar String:
        //-concat() solo usamos cuando hay una instancia, si hay null el programa se rompe. En cambio con el operador + se puede usar aunque el valor del String sea null
        //        -Se puede validar con un if
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
    }
}
