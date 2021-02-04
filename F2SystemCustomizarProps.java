import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class F2SystemCustomizarProps {
    public static void main(String[] args) {
        /*
        Existen 2 formas de agregar configuraciones, una es con un archivo de propiedades con extension .properties
        con un nombre (de la propiedad) y con un valor. (archivo config.properties)
         */
        try  {
            //Hay que cargar el archivo de propiedades abriendo un flujo de datos:
            FileInputStream archivoProps = new FileInputStream("src/config.properties" );

           //Ceamos un obj de propiedades con las props del sistema
            Properties props= new Properties(System.getProperties());

            //Cargamos las properties custom (que se agregan a las que ya estaban)
            props.load(archivoProps);

            //La otra es asignar vía métodos como setProperties() (ahora se agrega eso a lo anterior)
            props.setProperty("mi.prop.personalizada", "Valor-Personalizado");

            //Ahora seteamos ese conjunto de propiedades en el sistema
            System.setProperties(props);

            //Listamos las props del sistema
            System.getProperties().list(System.out);  //(System.getproperties() retorna un objeto propeties del systems)

            /* //Lo anterior es similar a:
              Properties p= System.getProperties()
              p.list(System.out);
             */

            //Para obtener una propiedad cualquiera, en este caso una personalizada
            System.out.println("System.getProperty(\"mi.prop.personalizada\") = "
                    + System.getProperty("mi.prop.personalizada"));

        }catch (Exception e) {
            System.out.println("Error: No se encontro el archivo");
            System.out.println("e = " + e.getMessage());

        }





    }
}
