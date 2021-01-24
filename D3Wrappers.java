public class D3Wrappers {
    public static void main(String[] args) {
        //Para crear objetos Wrapper ya no se usa el new Integer() sino el Integer.valueof(). Forma explicita
        Integer enteroW= Integer.valueOf(13423);

        //O de forma implicita,usando el autoboxing que es darle el valor como a un primitivo
        // y automaticamente java lo convierte en objeto Integer (forma implicita)
        Integer enteroAuto=12351;

        //unboxing, convertir un Integer a su primitivo int
        int e=enteroW.intValue();//Forma explicita
        int e2=enteroAuto;//Forma implicita

        /*
         Boolean se comporta un pocodistinto de las otras, con el operador == se compara el valor y no la referencia
        como en Integer o String, en los cuales habia que usar el método .equals() para comparar el valor.
         Aca tanto el == como .equals() comparan por valor
        */

        Boolean bool1= true;
        Boolean bool2= Boolean.valueOf("true");
        System.out.println("Por ==  " + (bool1==bool2));
        System.out.println("Por Equals() "+ bool1.equals(bool2));


    }
}
