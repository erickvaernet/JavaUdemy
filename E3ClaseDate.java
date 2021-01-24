import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class E3ClaseDate {

    public static void main(String[] args) {

        //Date de Java Util
        Date fecha = new Date();

        System.out.println("fecha = " + fecha);

        /*
        En el constructor ponemos el formato de fecha:
         "E" dia resumido
         "EEEE" dia completo
         "dd" para el dia en numero
         "MM" para el mes en numero
         "MMM" para nombre de mes acortado
         "MMMM" para el nombre del mess
         "yyyy" para el numero de año
         "HH" hora
         "mm" Minutos
         "ss" segundos
         Revisar doc de SimpleDateFormat para ver que es cada letra y los patroes
         luego usamos el formateador con el metodo format() para darle formato a la fecha que ya
         obtuvimos con Date
        */
        SimpleDateFormat formateador =
                new SimpleDateFormat("EEEE dd 'de' MMMM 'del' yyyy '('HH:mm:ss') Zona:'z");

        String fechaFormateada=formateador.format(fecha);

        System.out.println("fechaFormateada = " + fechaFormateada);
        
        //Tambien podemos obtener el tiempo en miliseg desde el 1 de enero de 1970 a partir de Date
        long actualTimeMili=fecha.getTime();
        System.out.println("actualTimeMili = " + actualTimeMili);
        long actualTimeSec = actualTimeMili/1000;
        System.out.println("actualTimeSec = " + actualTimeSec);
        long actualTimeMin= actualTimeSec/60;
        System.out.println("actualTimeMin = " + actualTimeMin);
        long actualTimeHour= actualTimeMin/60;
        System.out.println("actualTimeHour = " + actualTimeHour);
        

    }


}
