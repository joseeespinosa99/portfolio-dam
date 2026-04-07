/* Con FileWriter / FileReader*/
/*
import java.io.*;

public class Ejercicio4 {

    public static void main(String[] args) {

        try {

            FileWriter fw = new FileWriter("Empleados.txt");

            for (int i = 1; i <= 10; i++) {
                fw.write("ID: " + i + " Nombre: Empleado" + i + "\n");
            }

            fw.close();

            FileReader fr = new FileReader("Empleados.txt");

            int c;
            while ((c = fr.read()) != -1) {
                System.out.print((char) c);
            }

            fr.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}*/
/*Con BufferedWriter / BufferedReader */
import java.io.*;

public class Ejercicio4Buffered {

    public static void main(String[] args) {

        try {

            BufferedWriter bw = new BufferedWriter(new FileWriter("Empleados.txt"));

            for (int i = 1; i <= 10; i++) {
                bw.write("ID: " + i + " Nombre: Empleado" + i);
                bw.newLine();
            }

            bw.close();

            BufferedReader br = new BufferedReader(new FileReader("Empleados.txt"));

            String linea;

            while ((linea = br.readLine()) != null) {
                System.out.println(linea);
            }

            br.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
