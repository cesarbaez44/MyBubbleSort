import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class bubbleTesting {

    public static void printIntArray(int[] array){
        if (array == null){
            System.out.println("(arreglo vacío o error al leer archivo)");
            return;
        }
        for (int i = 0; i < array.length; i++){
            System.out.print(array[i] + (i < array.length - 1 ? " " : ""));
        }
        System.out.println();
    }

    public static void main(String[] args) throws IOException{
        bubbleFiles files = new bubbleFiles();
        BufferedReader bufer = new BufferedReader(new InputStreamReader(System.in));
        String fileName;
        int[] numeros;

        System.out.println("--------------------------------------");
        System.out.println("Ordenamiento Bubble Sort");
        System.out.print("Escribe el nombre del archivo de números a leer: ");
        fileName = bufer.readLine();

        numeros = files.fileToIntArray(fileName);
        System.out.println("Contenido original:");
        printIntArray(numeros);

        files.bubbleSort(numeros);
        System.out.println("Contenido ordenado:");
        printIntArray(numeros);

        System.out.print("Escribe el nombre del archivo de salida: ");
        fileName = bufer.readLine();
        files.writeIntArrayToFile(fileName, numeros);

        System.out.println("Proceso terminado. El archivo ordenado se guardó en C:\\archivos\\" + fileName);
    }
}