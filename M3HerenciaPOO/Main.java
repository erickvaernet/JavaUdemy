package M3HerenciaPOO;

public class Main {
    public static void main(String[] args) {

        /*
            Herencia: Mecanismo que tiene la poo para implementar relaciones de jerarquia de clases
        Una subclase hereda el estado y el comportamiento de sus ancestros
        Clase hija solo hereda de uno a la vez. Si no aclaramos un extends, por defecto se hereda de Object
        No puede existir herencia  si no existe una relacion familiar entre ambasclases. Tiene que haber una relacion
        coherente entre las clases en la realidad

            Generalización Relacion de uml: flecha que va de clase hija a clase padre, y termina ent riangulo blanco. Cuando
        tenemos clases con muchos atributos en comun y métodos quiere decir que podemos generalizar y construir una
        superclase que englove esos atributos y métodos, de manera que hacemos una generalizacion.
            Por el contrario cuando tenemos una clase en la app pero nos damos cuenta que necesitamos una clase más
        específica, es decir con otros métodos y atributos pero con características particulares

            Principio open-close explic. Si tenemos una clase implementada y funcional, pero nos damos cuenta que necesitamos
        nnuevas funcionalidades,  en vez de modificar es clase, debemos crear una subclase mas especifica de esta manera
        respetamos el principio haciendo que la clase general no se modifique y heredando su funcionalidad a una más
        específica con características particulares

        Sobrescritura: sobrescribir un método de la clase padre con otr aimplementación
        con final evitamos que se pueda  heredar una clase o par evitar sobrescritura de métodos
         */

        Alumno a1= new Alumno("Erick", "Vaernet",25
                ,"erickadrielnet@gmail.com","Don Bosco" );

        Profesor p1= new Profesor("Ricardo", "Guzman",35,"Matemática");

        AlumnoInternacional ai1= new AlumnoInternacional("Jony","Jensen",26
                ,"Don Bosco","Dinamarca");

        a1.setNotaLit(9);
        a1.setNotaMat(10);
        a1.setNotaQca(10);

        ai1.setNotaLit(8);
        ai1.setNotaMat(10);
        ai1.setNotaQca(9);
        ai1.setNotaIdioma(10);

        System.out.println();
        System.out.println("---------------INICIO-----------------");

        //Recorrer Jerarquia
        Class clase= ai1.getClass();
        while (clase.getSuperclass()!= null ){
            String padre= clase.getSuperclass().getName();
            String hija= clase.getName();
            System.out.println(hija+" es clase hija de: "+padre);
            clase=clase.getSuperclass();
        }

        System.out.println();
        System.out.println("---------------Creando ai2 como AlumnoInternacional-----------------");
        AlumnoInternacional ai2= new AlumnoInternacional();


        imprimirp(p1);
        imprimirp(a1);
        imprimirp(ai1);

        System.out.println();
        System.out.println("------------------con toString-------------------");
        System.out.println(p1.toString());
        System.out.println();
        System.out.println(a1.toString());
        System.out.println();
        System.out.println(ai1.toString());





    }

    public static void imprimirp(Persona1 p){
        if(p==null){
            System.err.println("Debe pasar como argumento un objeto de tipo Persona o un objeto que herede de ella");
            return;
        }
        System.out.println();
        System.out.println("===========Información de la instancia de "+p.getClass().getName()+"=============");
        System.out.println("Nombre: "+p.getNombre());
        System.out.println("Apellido: "+p.getApellido());
        System.out.println("Edad: "+p.getEdad());
        if (p instanceof Alumno){

            if (p instanceof AlumnoInternacional) {
                System.out.println("Pais:" + ((AlumnoInternacional) p).getPaisOrigen());
            }
            System.out.println("Colegio: "+ ((Alumno)p).getColegio());
            System.out.println("Nota Literatura: "+ ((Alumno)p).getNotaLit());
            System.out.println("Nota Matemática: "+ ((Alumno)p).getNotaMat());
            System.out.println("Nota Química: "+ ((Alumno)p).getNotaQca());

            if (p instanceof AlumnoInternacional) {
                System.out.println("Nota Idiomas:" + ((AlumnoInternacional) p).getNotaIdioma());
            }

            System.out.println("Peomédio:"+((Alumno) p).calcPromedio());//Se llama al método de quien corresponda

        }
        else if (p instanceof Profesor){
            System.out.println("Asignatura:"+ ((Profesor)p).getAsignatura());
        }

    }
}
