package P3PatronesDiseno.Composite;

public class Main {
    public static void main(String[] args) {

    /*
    *Composite: Nos permite construir objetos completos a partir de objetos mas simples que sean similares o del mismo
    tipo. Nos permite componer objetos en estructuras de árbol y trabajar con esas estructuras como si fueran objetos
    individuales.



     */
        Carpeta car1= new Carpeta ("Carpeta General");
        Carpeta car2= new Carpeta ("Archivos");
        Carpeta car3= new Carpeta ("Imagenes");
        Carpeta car4= new Carpeta ("Vacaciones");
        Componente arch1= new Carpeta ("Imagen1.jpg");
        Componente arch2= new Carpeta ("Erick.jpeg");
        Componente arch3= new Carpeta ("Roco.jpg");

        car1.addComponent(car2);
        car2.addComponent(car3);
        car3.addComponent(car4);
        car4.addComponent(arch1);
        car4.addComponent(arch2);
        car4.addComponent(arch3);

        System.out.println(car1.mostrar());
    }
}
