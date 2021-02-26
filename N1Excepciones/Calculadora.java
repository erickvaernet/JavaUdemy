package N1Excepciones;

public class Calculadora {

    public static double div(int a, int b)throws DivCeroException{
        //Si es checked tenemos que relanzar en el método
        if(b==0) throw new DivCeroException("No se puede dividir por 0");
        //Sino pusieramos el throws en el método es necesario manejar el error aca, a menos que sea Unchecked
        return a/(double)b;
    }

    public static int sumaEntera(int a, int b){
        //No nos obliga a relanzar la exc ya que es unchecked
        if(a==0) throw  new OtraException("a es 0, excepcion azar");
        return  a+b;
    }
}
