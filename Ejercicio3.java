import java.io.*;
import java.util.Scanner;

public class Ejercicio3 {

    static void borrarDirectorio(File dir) {

        if (dir.isDirectory()) {
            File[] archivos = dir.listFiles();

            if (archivos != null) {
                for (File f : archivos) {
                    borrarDirectorio(f);
                }
            }
        }

        dir.delete();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int opcion;

        File directorio = new File("C:\\AD\\Ejercicios\\nuevoDirectorio");
        File fichero = new File(directorio, "fichero_de_texto2.txt");

        String[] provincias = {
                "Almería",
                "Cádiz",
                "Córdoba",
                "Granada",
                "Huelva",
                "Jaén",
                "Málaga",
                "Sevilla"
        };

        do {

            System.out.println("\nMENU");
            System.out.println("1. Crear directorio");
            System.out.println("2. Crear fichero");
            System.out.println("3. Eliminar fichero fichero_de_texto.txt");
            System.out.println("4. Eliminar directorio aunque tenga contenido");
            System.out.println("5. Escribir provincias en fichero");
            System.out.println("6. Salir");

            opcion = sc.nextInt();

            try {

                switch (opcion) {

                    case 1:
                        directorio.mkdir();
                        System.out.println("Directorio creado.");
                        break;

                    case 2:
                        fichero.createNewFile();
                        System.out.println("Fichero creado.");
                        break;

                    case 3:
                        File ficheroEliminar = new File("C:\\AD\\Ejercicios\\miDirectorio\\fichero_de_texto.txt");
                        ficheroEliminar.delete();
                        System.out.println("Fichero eliminado.");
                        break;

                    case 4:
                        borrarDirectorio(directorio);
                        System.out.println("Directorio eliminado.");
                        break;

                    case 5:

                        BufferedWriter bw = new BufferedWriter(new FileWriter(fichero));

                        for (String provincia : provincias) {
                            bw.write(provincia);
                            bw.newLine();
                        }

                        bw.close();

                        System.out.println("Provincias escritas en el fichero.");
                        break;

                }

            } catch (IOException e) {
                e.printStackTrace();
            }

        } while (opcion != 6);

        sc.close();
    }
}