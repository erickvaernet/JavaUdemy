import javax.xml.namespace.QName;

public class E2ValorVsReferencia {
    public static void main(String[] args) {

        /*
        Si pasamos un primitivo como int a un metodo y dentro del método se modifica, luego cuando se
         salga del método, ese int original mantendrá su valor.  Ya que se pasa por valor la variable,
         mientras que si se pasara por referencia (Como un objeto) si cambiaria. Pero hay excepciones:
         las Clases Wrapper y String que son inmutables por lo tanto cuando se modifican retornan una
         nueva instancia, no modifican la original por lo tanto al pasar un String a un método o un
         Integer, estos no se verán afectados independientemente de lo que se haga dentro del método.
         */

        //Ejemplos de paso por valor:
        int entero0 = 0;
        System.out.println("entero0 = " + entero0);
        modificarInt(entero0);
        System.out.println("entero0 = " + entero0);

        Integer entero1=1;
        System.out.println("entero1 = " + entero1);
        modificarInteger(entero1);
        System.out.println("entero1 = " + entero1);

        String cadena= "hola";
        System.out.println("caden = " + cadena);
        modificarString(cadena);
        System.out.println("cadena = " + cadena);

        //Ejemplo de paso por Referencia y con tipos mutables:

        //Con arreglo
        int [] arrInt= {1,2,3,4,5};
        int aux=0;
        for (int num:arrInt) {
            System.out.println("num"+aux+"= " + num);
            aux++;
        }
        modifArray(arrInt);
        aux=0;
        for (int num:arrInt) {
            System.out.println("num modif"+aux+"= " + num);
            aux++;
        }

        //Con clase nuestra

        Persona p1= new Persona("Erick",25);
        System.out.println("p1.getName() = " + p1.getName());
        System.out.println("p1.getAge() = " + p1.getAge());

        modifPersona(p1);
        System.out.println("p1.getName() Modificado = " + p1.getName());
        System.out.println("p1.getAge() Modificado = " + p1.getAge());


    }
    //Métodos de modificacion ; De ejemplos por Valor
    public static void modificarInteger(Integer i){
        i+=10;
        i.valueOf(1000000);
    }
    public static void modificarInt(int i){i+=10;}
    public static void modificarString(String s){s+="chau";}

    //Métodos de modificacion ; De ejemplos por Referencia
    public static void  modifArray(int [] arr){
        arr[0]+=6;
        arr[1]+=7;
        arr[2]+=8;
        arr[3]+=9;
        arr[4]+=11;
    }
    public static void modifPersona(Persona p){
        p.setName("NuevoNmbreModificado");
        p.setAge(312);
    }
}

class Persona {
    private String name;
    private int age;

    public Persona(String nombre, int edad){
        this.name=nombre;
        this.age=edad;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
