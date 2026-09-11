package co.edu.uniquindio.poo;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Tarea {
    static void main() {
        int[][] matriz = {{3, 2, 1}, {5, 4, 6}, {8, 7, 9}};

        int suma = sumarNumeros(matriz);
        System.out.println("La suma de todos los numeros en la matriz es:" +suma);
        int sumaDiagonal = sumaDiagonal(matriz);
        System.out.println("La suma de los numeros que conforman la diagonal principal de la matriz es:" +sumaDiagonal);
        int  [][] matrizConEspiral=matrizEspiral();
        String mensaje= mostrarMatriz(matrizConEspiral);
        System.out.println(mensaje);

    }

    public static int sumarNumeros(int[][] matriz) {
        int suma = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                suma += matriz[i][j];
            }
        }
        return suma;
    }

    public static int sumaDiagonal(int[][] matriz) {
        int sumaDiagonal = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (j == i) {
                    sumaDiagonal += matriz[i][j];
                }
            }
        }
        return sumaDiagonal;
    }

    public static int[][] matrizEspiral() {
        int[][] matrizConEspiral = new int[3][3];
        int numerosEspiral=1;
        //Poner los numeros (1,2,3 de izquierda a derecha
        for (int i = 0; i < 3; i++) {
           matrizConEspiral[0][i]=numerosEspiral;
            numerosEspiral++;
        }
        //Poner los numeros (4,5) de arriba hacia abajo
        for(int j= 1; j <3; j++){
            matrizConEspiral[j][2]= numerosEspiral;
            numerosEspiral++;
        }
        //Poner los numeros (6,7) de derecha a izquierda
        for(int k= 1; k>=0;k--){
            matrizConEspiral[2][k]= numerosEspiral;
            numerosEspiral++;
        }
        //Poner el 8 de abajo hacia arriba
        for(int l=1;l>0;l--){
            matrizConEspiral[l][0]=numerosEspiral;
            numerosEspiral++;
        }
        //Poner el 9 en el centro de la matriz
        matrizConEspiral[1][1]=numerosEspiral;
        return matrizConEspiral;
        }
        public static String mostrarMatriz(int [][] matrizConEspiral){
         String mensaje="Matriz con sus numeros ordenados en espiral: ";
          for(int i=0;i<3;i++){
              for(int j=0;j<3;j++){
                  mensaje+= matrizConEspiral[i][j];
              }
              mensaje+= "\n";
          }
          return mensaje;
        }

    }
