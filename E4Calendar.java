import java.util.Calendar;

public class E4Calendar {
    public static void main(String[] args) {

        //Calendar es abstracto pero se puede crear instania con .getInsantce() este a su vez crea
        // un objeto de GregorianCalendar o chineseCalendar o etc, dependiendo de la zona en la que esteemos

        //En occidente es un GregorianCalendar, por eso es abstracto y es necesario usar un método
        //para obtener una instancia
        Calendar calendario= Calendar.getInstance();

    }
}
