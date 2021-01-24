public class C1Tercero {
    public static void main (String [] args){

        /*
        String j = new String("hola");

        String k= j.transform(f->{return f+"chau";});
        System.out.println(k);

        System.out.println(k.replace("h","u"));

         */

        //Comparando tiempos de +, concat() y StringBuilder

        String a="a";
        String b="b";
        String c="c";


        /*
        //-----------------String con + 31 miliseg (OJO, ALAUMENTAR EL limite a 10.000 el + tarda MENOS que concat())------------------------------
        long start = System.currentTimeMillis();

        for(int i=0; i<1000; i++){
            a+=b+c;
        }

        long end = System.currentTimeMillis();

        System.out.println(" '+' = "+(end-start));
        //--------------------------------------------
        */

        /*
        //------------String con concat() 6 miliseg---------------------------
        long start = System.currentTimeMillis();

        for(int i=0; i<1000; i++){
            a=a.concat(b).concat(c);
        }

        long end = System.currentTimeMillis();

        System.out.println(" .concat()= "+(end-start));
        //--------------------------------------------
         */

         /*
        //----------String con StringBuilder 0 miliseg------------------------
        StringBuilder sb= new StringBuilder(a);
        long start = System.currentTimeMillis();

        for(int i=0; i<1000; i++){
            sb.append(b).append(c);
        }

        long end = System.currentTimeMillis();

        System.out.println(" StringBuilder= "+(end-start));

        //--------------------------------------------
        */

         //Ejemplo Con 10.000 ms, donde se invierten los roles y + tarda menos que concat(); StringBuilder sigue siendo el mas rapido

        /*
        StringBuilder sb1= new StringBuilder(a);
        long start = System.currentTimeMillis();

        for(int i=0;i<10000; i++){
            //a+=b+c; // =>105ms
            a = a.concat(b).concat(c);// =>127ms
            //sb1.append(b).append(c);// => 3ms
        }

        long end = System.currentTimeMillis();
        System.out.println("Tiempo = "+(end-start));
         */


    }
}
