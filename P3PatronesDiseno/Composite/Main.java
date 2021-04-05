package P3PatronesDiseno.Composite;

public class Main {
    public static void main(String[] args) {

    /*
    *Composite: Nos permite construir objetos completos a partir de objetos mas simples que sean similares o del mismo
    tipo. Nos permite componer objetos en estructuras de árbol y trabajar con esas estructuras como si fueran objetos
    individuales.


    *Cuando Usarlo:
    - Utiliza el patrón Composite cuando tengas que implementar una estructura de objetos con forma de árbol.
    - Utiliza el patrón cuando quieras que el código cliente trate elementos simples y complejos de la misma forma.

    *Implementacion:
    - Asegúrate de que el modelo central de tu aplicación pueda representarse como una estructura de
      árbol. Intenta dividirlo en elementos simples y contenedores. Recuerda que los contenedores deben ser capaces de
      contener tanto elementos simples como otros contenedores.
    - Declara la interfaz componente con una lista de métodos que tengan sentido para componentes simples y complejos.
    - Crea una clase hoja para representar elementos simples. Un programa puede tener varias clases hoja diferentes.
    - Crea una clase contenedora para representar elementos complejos. Incluye un campo matriz en esta clase para
      almacenar referencias a subelementos. La matriz debe poder almacenar hojas y contenedores, así que asegúrate de
      declararla con el tipo de la interfaz componente.
    - Al implementar los métodos de la interfaz componente, recuerda que un contenedor debe delegar la mayor parte del
      trabajo a los subelementos.
    - Por último, define los métodos para añadir y eliminar elementos hijos dentro del contenedor.
    - Ten en cuenta que estas operaciones se pueden declarar en la interfaz componente. Esto violaría el Principio de
      segregación de la interfaz porque los métodos de la clase hoja estarían vacíos. No obstante, el cliente podrá
      tratar a todos los elementos de la misma manera, incluso al componer el árbol.


     */
        Carpeta car1= new Carpeta ("Carpeta General");
        Carpeta car2= new Carpeta ("Archivos");
        Carpeta car3= new Carpeta ("Imagenes");
        Carpeta car4= new Carpeta ("Vacaciones");
        Componente arch1= new Archivo ("Imagen1.jpg");
        Componente arch2= new Archivo ("Erick.jpeg");
        Componente arch3= new Archivo ("Roco.jpg");
        Carpeta car5= new Carpeta ("Casa");
        Componente arch4= new Archivo ("Gato.jpg");
        Componente arch5= new Archivo ("Perro.jpg");


        car1.addComponent(car2);
        car2.addComponent(car3);
        car3.addComponent(car4);
        car4.addComponent(arch1);
        car4.addComponent(arch2);
        car4.addComponent(arch3);
        car3.addComponent(car5);
        car5.addComponent(arch4);
        car5.addComponent(arch5);

        System.out.println(car1.mostrar(1));

        System.out.println(car1.buscar("gato.jpg"));
    }
}
