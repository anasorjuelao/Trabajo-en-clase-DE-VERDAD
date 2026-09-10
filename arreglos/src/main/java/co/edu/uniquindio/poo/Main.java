package co.edu.uniquindio.poo;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.

        int[] arreglo = {1, 2, 6, 4, 3};

        String mensaje= sumatoria(arreglo);
        System.out.println(mensaje);

        int numero= 4;

        String mensaje2= numeroExistente(numero, arreglo);
        System.out.println(mensaje2);

        String mensaje3= numeroRepetido(arreglo);
        System.out.println(mensaje3);
    }
    public static String sumatoria(int [] arreglo){
        String mensaje= "";
        int suma= 0;
        for(int i=0; i<arreglo.length;i++ ){
            suma+=arreglo[i] ;
        }
        mensaje += "La suma del arreglo es: " +suma;
        return mensaje;
    }
    public static String numeroExistente (int numero, int [] arreglo){
        String mensaje2= "";

        for(int i=0; i<arreglo.length;i++){
            if(arreglo[i]== numero){
                mensaje2+="El numero ya existe en este arreglo.";
                break;
            }
            else{
                mensaje2+="El numero no existe en el arreglo.";
                break;
            }
        }
        return mensaje2;
    }
    //Tarea
    public static String numeroRepetido (int [] arreglo){
        String mensaje3="";
        int numeroRepetido= 0;
        for(int i=0; i<arreglo.length;i++){
            if(i<arreglo.length-1){
            for(int j=i+1; j<arreglo.length;j++) {
                if (arreglo[i] == arreglo[j]) {
                    numeroRepetido = arreglo[i];
                    mensaje3+= "Hay un numero repetido en el arreglo y es: " + numeroRepetido;
                    return mensaje3;
                }
                else{
                    mensaje3+="No hay ningun numero repetido en este arreglo.";
                    return mensaje3;
                }
            }
            }
        }
        return mensaje3;
    }

}

