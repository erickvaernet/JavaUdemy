import javax.swing.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class E5StringAFechaDate {
    public static void main(String[] args) {

        //Se debe tener en cuenta el patron a la hora de ingresar un String para que pase a fecha

        SimpleDateFormat formateador= new SimpleDateFormat("dd/MM/yyyy");

        try {
            Date fechaIngresada = formateador.parse(JOptionPane.showInputDialog("Fecha con Formato 'dia/mes/año' : "));
            System.out.println("fechaIngresada = " + fechaIngresada);
            System.out.println("Fecha formateada = " + formateador.format(fechaIngresada));

            //Comparar Fechas:
            Date fechaActual= new Date();

            if(fechaIngresada.after(fechaActual)) System.out.println("La fecha ingresada es posterior a la fecha actual");
            else if(fechaIngresada.before(fechaActual))  System.out.println("La fecha ingresada es anterior a la fecha actual");
            else if (fechaIngresada.equals(fechaActual)) System.out.println("Fechas son iguals");

        } catch (ParseException e) {
            e.printStackTrace();
        }

    }
}
