import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

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
}