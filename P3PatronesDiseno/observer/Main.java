package P3PatronesDiseno.observer;

public class Main {
    public static void main(String[] args) {
        /*
        *Observer: es un patrón de diseño de comportamiento que te permite definir un mecanismo de suscripción para
        notificar a varios objetos sobre cualquier evento que le suceda al objeto que están observando.

        *Cuando Aplicar:
          - Utiliza el patrón Observer cuando los cambios en el estado de un objeto puedan necesitar cambiar otros
          objetos y el grupo de objetos sea desconocido de antemano o cambie dinámicamente.
          - Utiliza el patrón cuando algunos objetos de tu aplicación deban observar a otros, pero sólo durante un t
          tiempo limitado o en casos específicos.

        *Implementacion:
        - Repasa tu lógica de negocio e intenta dividirla en dos partes: la funcionalidad central, independiente del
        resto de código, actuará como notificador; el resto se convertirá en un grupo de clases suscriptoras.
        - Declara la interfaz suscriptora. Como mínimo, deberá declarar un único método actualizar.
        - Declara la interfaz notificadora y describe un par de métodos para añadir y eliminar de la lista un objeto
        suscriptor. Recuerda que los notificadores deben trabajar con suscriptores únicamente a través de la interfaz
        suscriptora.
        - Decide dónde colocar la lista de suscripción y la implementación de métodos de suscripción. Normalmente, este
        código tiene el mismo aspecto para todos los tipos de notificadores, por lo que el lugar obvio para colocarlo es
        en una clase abstracta derivada directamente de la interfaz notificadora. Los notificadores concretos extienden
        esa clase, heredando el comportamiento de suscripción.
        - Sin embargo, si estás aplicando el patrón a una jerarquía de clases existentes, considera una solución basada
        en la composición: coloca la lógica de la suscripción en un objeto separado y haz que todos los notificadores
        reales la utilicen.
        - Crea clases notificadoras concretas. Cada vez que suceda algo importante dentro de una notificadora, deberá
        notificar a todos sus suscriptores.
        - Implementa los métodos de notificación de actualizaciones en clases suscriptoras concretas. La mayoría de las
        suscriptoras necesitarán cierta información de contexto sobre el evento, que puede pasarse como argumento del
        método de notificación.
        - Pero hay otra opción. Al recibir una notificación, el suscriptor puede extraer la información directamente de
        ella. En este caso, el notificador debe pasarse a sí mismo a través del método de actualización. La opción menos
        flexible es vincular un notificador con el suscriptor de forma permanente a través del constructor.
        - El cliente debe crear todos los suscriptores necesarios y registrarlos con los notificadores adecuados.

         */
    }
}
