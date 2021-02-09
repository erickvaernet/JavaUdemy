public class H1LineaComandosArgs {
    public static void main(String[] args) {

        /*
            Se compila con comando:
            $ javac nombredeArchiv.java
            y se ejecuta el nombredeArchiv.class con:
            $ java nombredeArchivo argumento1 argumento2 argumento3
            ACLARACION: SACAR EL .class EN EL NOMBRE AL EJECUTAR CON JAVA, usar solo el nombre
         */
        if (args.length==0){
            System.err.println("Error: Se debe ingresar argumentos");
            System.exit(-1);
        }
        else {
            for (int i = 0; i < args.length; i++) {
                //Para que funcione el Nº y acentos poner como bandera en java c -encoding utf8
                //javac H1LineaComandosArgs.java -encoding utf8
                System.out.println("Argumento Nº " + i + " = " + args[i]);
            }
        }
    }
}
