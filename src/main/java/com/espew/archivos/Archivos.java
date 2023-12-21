/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.espew.archivos;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
/**
 *
 * @author USUARIO
 */
public class Archivos {

    public static void main(String[] args)throws FileNotFoundException {
       // Ruta del archivo
        String rutaArchivo = "C:\\Users\\USUARIO\\Documents\\NetBeansProjects\\doc1.txt";

        try {
            // Crear una instancia de Scanner con el objeto File
            Scanner scanner = new Scanner(new File(rutaArchivo));

            // Leer el archivo línea por línea
            while (scanner.hasNextLine()) {
                String linea = scanner.nextLine();
                System.out.println(linea);
            }

            // Cerrar el scanner al finalizar
            scanner.close();
        } catch (FileNotFoundException e) {
            System.err.println("Archivo no encontrado: " + e.getMessage());
        }
    }
}

