import java.util.Properties;

public class F1SystemgetProperty {
    public static void main(String[] args) {

        //System, el Método getProperty("llave") necesita una "llave" para obtener esa x propiedad,
        //la llave se la puede encontrar en la documentación de oracle
        String wDirectory = System.getProperty("user.dir");
        System.out.println("wDirectory = " + wDirectory);
        
        String hDirectory = System.getProperty("user.home");
        System.out.println("hDirectory = " + hDirectory);
        
        String userName = System.getProperty("user.name");
        System.out.println("userName = " + userName);

        //Para obtener todas las propiedades y listarlas
        Properties propiedades= System.getProperties();

        propiedades.list(System.out);

        //getPropreties() devuelve objeto Properties mientras que getProperty() solo un String
    }
}
