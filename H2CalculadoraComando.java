public class H2CalculadoraComando {
    public static void main(String[] args) {
        if(args.length!=3){
            System.exit(-1);
            System.out.println("Ingrese una operación (suma, resta, div, mult) seguido de dos numeros");
        }
        String operation= args[0];
        double a = Double.parseDouble(args[1]);
        double b = Double.parseDouble(args[2]);
        double resultado;
        switch (operation){
            case "suma":
                resultado= a+b;
                break;
            case "resta":
                resultado= a-b;
                break;
            case "div":
                if (b==0){
                    System.out.println("No se puede dividir por 0");
                    System.exit(-1);
                }
                resultado= a/b;
                break;
            case "mult":
                resultado= a*b;
                break;
            default:
                resultado= a+b;
        }

        System.out.println("resultado de "+operation+"("+a+","+b+")"+" = " + resultado);


    }
}
