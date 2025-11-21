import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;

public class bubbleFiles {

    public int countFileLines(String fileName){
        File file;
        FileReader reader;
        BufferedReader bufer;
        int numLines = 0;

        try{
            file = new File("C:\\archivos\\" + fileName);
            reader = new FileReader(file);
            bufer = new BufferedReader(reader);
            while ((bufer.readLine()) != null){
                numLines++;
            }
            reader.close();
        } catch (Exception e) {
            System.out.println("Error al leer el archivo: " + e.toString());
        }
        return numLines;
    }

    public int[] fileToIntArray(String fileName){
        File file;
        FileReader reader;
        BufferedReader bufer;
        String linea;
        int[] array = null;
        int i = 0;
        int t;
        try{
            t = countFileLines(fileName);
            array = new int[t];
            file = new File("C:\\archivos\\" + fileName);
            reader = new FileReader(file);
            bufer = new BufferedReader(reader);
            while ((linea = bufer.readLine()) != null){
                array[i] = Integer.parseInt(linea.trim());
                i++;
            }
            reader.close();
        } catch (Exception e){
            System.out.println("Error al leer el archivo: " + e.toString());
        }
        return array;
    }

    public void writeIntArrayToFile(String fileName, int[] array){
        FileWriter file;
        PrintWriter writer;
        try{
            file = new FileWriter("c:\\archivos\\" + fileName);
            writer = new PrintWriter(file);
            for (int unDato : array)
                writer.println(unDato);
            file.close();
        } catch (Exception e) {
            System.out.println("Error al crear el archivo: " + e.toString());
        }
    }

    // Bubble Sort para enteros (in-place)
    public void bubbleSort(int[] arr){
        if (arr == null) return;
        int n = arr.length;
        boolean swapped;
        for (int i = 0; i < n - 1; i++){
            swapped = false;
            for (int j = 0; j < n - i - 1; j++){
                if (arr[j] > arr[j + 1]){
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) break;
        }
    }
}