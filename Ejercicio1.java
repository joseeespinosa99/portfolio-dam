import java.io.File;
import java.io.IOException;

public class Ejercicio1 {
    public static void main(String[] args) {

        try {
            // Crear directorio
            File directorio = new File("C:\\AD\\Ejercicios\\miDirectorio");
            if (directorio.mkdirs()) {
                System.out.println("Directorio creado correctamente.");
            } else {
                System.out.println("El directorio ya existe.");
            }

            // Crear archivo
            File fichero = new File(directorio, "fichero_de_texto.txt");
            if (fichero.createNewFile()) {
                System.out.println("Fichero creado correctamente.");
            } else {
                System.out.println("El fichero ya existe.");
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}