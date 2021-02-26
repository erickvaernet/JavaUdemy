package N1Excepciones;

public class Main2 {
    public static void main(String[] args) {

        //por si solo este métod oobliga a tratar el error con try catch ya que extendimos divCeroExc de Exception(Checked)
        //Calculadora.div(2,3);

        try {
            Calculadora.div(2,0);
        } catch (DivCeroException e) {
            System.out.println("Error:"+e.getMessage());
            System.out.println("Ruta:");
            e.printStackTrace();
        }

    }
}
