package co.edu.uniquindio.poo;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
         int [] [] matriz ={{3,2,1},{5,4,6},{8,7,9}};

         int suma= sumarNumeros(matriz);
         System.out.println(suma);
         int sumaDiagonal= sumaDiagonal(matriz);
         System.out.println(sumaDiagonal);

    }
    public static int sumarNumeros(int [][] matriz){
        int suma=0;
        for(int i=0;i<matriz.length; i++){
            for(int j=0;j<matriz[i].length; j++){
                suma+= matriz[i][j];
            }
        }
        return suma;
    }
    public static int sumaDiagonal(int [][] matriz){
        int sumaDiagonal=0;
        for(int i=0;i<matriz.length; i++){
            for(int j=0;j<matriz[i].length; j++){
                if(j==i) {
                    sumaDiagonal += matriz[i][j];
                }
            }
        }
        return sumaDiagonal;
    }
    public static int [][] matrizEspiral(){
        int [][] matrizConEspiral= new int [3] [3];
        for(int i=0;i<3;i++ ){
            for(int j=0;j<3;j++) {
                matrizConEspiral[i][3] = i++;
            }
        }
        return matrizConEspiral;
    }
}
