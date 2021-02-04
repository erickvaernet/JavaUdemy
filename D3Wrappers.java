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

        /*
        D3-Wrappers o clases envolventes

        -Boxing con .valueOf() pasar un primitivo a instancia de clase Wrapper
        -Unboxing con  Objeto.booleanValue() o .intValue() o .floatValue() para pasar de una instancia de clase envolvente a un tipo primitivo
        -Autoboxing es la forma automatica enla que java nos transforma un valor como 123 a una instancia de wrappper sin tener que utilizar los metodos .valueof()
        o new Objeto () {Esto quedo obsoleto ya que solo se usa valueOf para instanciar o el autoboxing}

        //Para crear objetos Wrapper ya no se usa el new Integer() sino el Integer.valueof(). Forma explicita
            Integer enteroW= Integer.valueOf(13423);

        //O de forma implicita,usando el autoboxing que es darle el valor como a un primitivo
        // y automaticamente java lo convierte en objeto Integer (forma implicita)
            Integer enteroAuto=12351;

        //unboxing, convertir un Integer a su primitivo int
            int e=enteroW.intValue();//Forma explicita
            int e2=enteroAuto;//Forma implicita

        -Boolean se comporta un pocodistinto de las otras, con el operador == se compara el valor y no la referencia como en Integer o String, en los cuales habia que usar
        el método .equals() para comparar el valor. Aca tanto el == como .equals() comparan por valor

            Boolean bool1= true;
            Boolean bool2= Boolean.valueOf("true");
            System.out.println("Por ==  " + (bool1==bool2));
            System.out.println("Por Equals() "+ bool1.equals(bool2));

         */


    }
}
