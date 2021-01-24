public class D1Operadores {
    public static void main(String[] args) {
        /*
        -Op Aritméticos: para primitivos y wrappers/ *+-%/--++
        -Op combinados: asignacion+aritmeticos += -= /= *=etc
        */

        //incremento

        System.out.println("....Post");
        int num=1;
        System.out.println(num++);
        System.out.println(num);

        num=1;
        System.out.println("---Pre");
        System.out.println(++num);
        System.out.println(num);

        num=1;
        int num2=num++;
        System.out.println("num "+num+",  num2 "+num2);

        //Ternario
        boolean primerVista= true;
        String saludar= (primerVista)? "hola": "chau";
        System.out.println(saludar);

        //Op Relacionales < > <= >= == !=

        //Op logicos  && || ! pero tmb & | que siempre evaluan ambas expresiones, o ^ para xor
    }
}
