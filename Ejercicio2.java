import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int opcion;

        File nuevoDirectorio = new File("C:\\AD\\Ejercicios\\nuevoDirectorio");
        File fichero = new File("C:\\AD\\Ejercicios\\nuevoDirectorio\\fichero_de_texto2.txt");
        File ficheroEliminar = new File("C:\\AD\\Ejercicios\\miDirectorio\\fichero_de_texto.txt");

        do {

            System.out.println("\nMENU");
            System.out.println("1. Crear directorio nuevoDirectorio");
            System.out.println("2. Crear fichero fichero_de_texto2.txt");
            System.out.println("3. Eliminar fichero fichero_de_texto.txt");
            System.out.println("4. Eliminar directorio nuevoDirectorio");
            System.out.println("5. Salir");
            System.out.print("Opción: ");

            opcion = sc.nextInt();

            try {

                switch (opcion) {

                    case 1:
                        if (nuevoDirectorio.mkdir()) {
                            System.out.println("Directorio creado.");
                        } else {
                            System.out.println("No se pudo crear o ya existe.");
                        }
                        break;

                    case 2:
                        if (fichero.createNewFile()) {
                            System.out.println("Fichero creado.");
                        } else {
                            System.out.println("El fichero ya existe.");
                        }
                        break;

                    case 3:
                        if (ficheroEliminar.delete()) {
                            System.out.println("Fichero eliminado.");
                        } else {
                            System.out.println("No se pudo eliminar.");
                        }
                        break;

                    case 4:
                        if (nuevoDirectorio.delete()) {
                            System.out.println("Directorio eliminado.");
                        } else {
                            System.out.println("No se pudo eliminar.");
                        }
                        break;

                }

            } catch (IOException e) {
                e.printStackTrace();
            }

        } while (opcion != 5);

        sc.close();
    }
}