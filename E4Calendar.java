import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class E4Calendar {
    public static void main(String[] args) {

        //Calendar es abstracto pero se puede crear instania con .getInsantce() este a su vez crea
        // un objeto de GregorianCalendar o chineseCalendar o etc, dependiendo de la zona en la que esteemos

        //En occidente es un GregorianCalendar, por eso es abstracto y es necesario usar un método
        //para obtener una instancia
        Calendar calendario= Calendar.getInstance();

        //Obtenemos el Date a partir del sig método
        Date fecha = calendario.getTime();

        System.out.println("fecha = " + fecha);

        //Podemos setear la fecha y hora: Año,Mes(Parte desde 0=enero),Día, Hora,min,seg
        calendario.set(2019,0,26,17,25,10);

        //U otra forma de setear valores es con el campo y el valor:
        calendario.set(calendario.YEAR,2022);
        calendario.set(calendario.MONTH, 11); //11=Diciembre o 12 en String
        calendario.set(calendario.HOUR_OF_DAY, 22); //Hour of day es formato 24 hs y solo hour es para 12 hs con am o pm

        //volvemos a obtener la fecha de tipo Date
        Date fechaModif= calendario.getTime();

        //creamos el simpleDateFormat para luego formatear la fecha
        SimpleDateFormat formateador=  new SimpleDateFormat("dd/MM/yyyy");
        String fechaModifFormat= formateador.format(fechaModif);

        System.out.println("fechaModifFormat = " + fechaModifFormat);
    }
}
