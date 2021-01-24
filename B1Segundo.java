public class B1Segundo {
    public static void main(String [] args){
        String a="a";
        String b= new String("a");
        String c= "a";
        System.out.println(a+c);

        long fRecursivo;
        long iRecursivo= System.currentTimeMillis();
        sumaRecursiva(1);
        fRecursivo= System.currentTimeMillis();
        System.out.println("tiempo recursivo = " + (fRecursivo-iRecursivo));


    }

    public static void sumaRecursiva (int entero){
        if(entero==10000) return;
        else sumaRecursiva(entero+1);
    }
}

