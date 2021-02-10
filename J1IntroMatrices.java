public class J1IntroMatrices {
    public static void main(String[] args) {

        //Primero fila y despues columna

        int[][] matrix1= new int [3][3];

        int[][] matrix2 ={{1,2,3,4},{1,2,3,4}};

        int[][] matrix3 ={
                {1,2,3,4},
                {1,2,3,4},
                {4,3,1,7}
        };

        System.out.println("matrix3 = ");
        for (int i=0; i<matrix3.length;i++){
            for (int j=0; j<matrix3[0].length; j++){
                System.out.print(matrix3[i][j]+",");
            }
            System.out.print("\b\n");
        }

        //Matrices con cantidad de columnas variables
        int[][] matrix4= new int[3][];
        matrix4[0]= new int[2];
        matrix4[1]= new int[3];
        matrix4[2]= new int[4];

        System.out.println();
        System.out.println("-----------------------------------");
        System.out.println("Matriz4 tamaño variable de columnas");;
        System.out.println("fila 0, columnas="+ matrix4[0].length);
        System.out.println("fila 1, columnas="+ matrix4[1].length);
        System.out.println("fila 2, columnas="+ matrix4[2].length);
        System.out.println("-----------------------------------");

        //llenamos la matriz4
        for (int i=0; i<matrix4.length;i++){
            for (int j=0; j<matrix4[i].length; j++){
                matrix4[i][j]=i*j;
            }
        }

        //Imprimimos la matriz4
        System.out.println("Matriz4=");
        for (int i=0; i<matrix4.length;i++){
            for (int j=0; j<matrix4[i].length; j++){
                System.out.print(matrix3[i][j]+",");
            }
            System.out.print("\b\n");
        }


    }
}
