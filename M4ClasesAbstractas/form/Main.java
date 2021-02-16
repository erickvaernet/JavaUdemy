package M4ClasesAbstractas.form;

import M4ClasesAbstractas.form.elementos.*;
import M4ClasesAbstractas.form.elementos.select.Opcion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        /*
         Clases Abstractas, son clases que no se pueden instanciar, representan una clase padre o una clase muy conceptual.
         Ej: Forma(agrupa cirulo,triangulo,cuadrado),Comida,Felino, etc
         Métodos abstractos no tienen implementación, solo se declara el método, clases hijas tendran la implementacion

         */


        InputForm username= new InputForm("username");
        InputForm pass = new InputForm("contraseña", "password");
        InputForm email= new InputForm("email","email");
        InputForm edad= new InputForm("edad","number");

        TextareaForm experiencia = new TextareaForm("experiencia laboral",5,9);

        SelectForm lenguaje = new SelectForm("lenguaje");

        Opcion java =new Opcion("1","Java");
        lenguaje.addOpcion(java);

        lenguaje.addOpcion(new Opcion("2","Python").setSelected()) //gracias asobrecarga de métodos. Ver en Opcion
                .addOpcion(new Opcion("3","JavaScript"))
                .addOpcion(new Opcion("4","C++"));

        //Solo se pueden crear clases anonimas a partir de clases abstractas
        ElementosForm saludar = new ElementosForm() {
            @Override
            public String dibujarHTML() {
                return "<input disabled name='"+this.nombre+"' value=\""+this.valor+"\">";
            }
        };


        username.setValor("Erick7897");
        pass.setValor("CoD*306");
        email.setValor("erickadrielnet@gmail.com");
        edad.setValor("25");
        experiencia.setValor("......10 años de experiencia en.....");
        //java.setSelected(true); //Ya seleccionamos python atras, no debe haber mas de un seleccionado
        saludar.setValor("Esto se encuentra deshabilitado");

        //Opción más simple
        List<ElementosForm> elementos = Arrays.asList(username,pass,email,edad,experiencia,lenguaje,saludar);
        /*
        List<ElementosForm> elementos = new ArrayList<ElementosForm>();
        elementos.add(username);
        elementos.add(pass);
        elementos.add(email);
        elementos.add(edad);
        elementos.add(experiencia);
        elementos.add(lenguaje);
         */

        /*
        for (ElementosForm e:elementos){
            System.out.println(e.dibujarHTML());
            System.out.println("<br>");
        }
         */

        //otra forma de iterar:
        elementos.forEach(e->{
            System.out.println(e.dibujarHTML());
            System.out.println("<br>");
        });


    }
}
