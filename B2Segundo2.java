public class B2Segundo2 {
    public static void main(String [] args){
        String a="a";
        String b= new String("a");
        String c= "a";
        System.out.println(a+c);

        long f=0;
        long fFor;
        long iFor= System.currentTimeMillis();
        for (int i=1;i<=10000;i++) f+=1;
        fFor= System.currentTimeMillis();
        System.out.println("tiempo For = " + (fFor-iFor));

    }

}

