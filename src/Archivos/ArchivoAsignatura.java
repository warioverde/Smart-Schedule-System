package Archivos;

import java.io.*;
import java.util.ArrayList;

/**
 *
 * @author Jorge
 */
public class ArchivoAsignatura {

    private String ruta = "build\\classes\\Archivos\\Asignaturas.txt";

    public ArchivoAsignatura() {
    }

    public String[] leerArchivo() {
        ArrayList<String> cadenas = new ArrayList<>(); //Limito a 8 registros para asignaturas
        int contador = 0;
        try {
            RandomAccessFile arch = new RandomAccessFile(ruta, "rw");
            String cadena = arch.readLine();
            while (cadena != null && !cadena.equals("")) {
                cadenas.add(cadena);
                cadena = arch.readLine();
                contador++;
            }
            arch.close();
        } catch (IOException e) {
            System.out.println(e);
        }
        return arrayToAList(cadenas);
    }

    public String[] arrayToAList(ArrayList<String> list) {
        String[] array = new String[list.size()];
        for (int i = 0; i < list.size(); i++) {
            array[i] = list.get(i);
        }
        return array;
    }

    public void escribirArchivo(int linea, String cadena) {
        try {
            RandomAccessFile arch = new RandomAccessFile(this.ruta, "rw");
            for (int i = 0; i < linea; i++) {
                arch.readLine();
            }
            arch.writeBytes(cadena);

            cadena = arch.readLine();
            arch.close();
        } catch (IOException e) {
            System.out.println(e);
        }
    }

    public void escribirArchivo(String cadena) {
        try {
            RandomAccessFile arch = new RandomAccessFile(this.ruta, "rw");
            String w = " test";
            int contador = 0;
            while (w != null && !w.equals("")) {
                w = arch.readLine();
                contador++;
            }
            arch.close();
            escribir(contador, cadena);
        } catch (IOException e) {
            System.out.println(e);
        }
    }

    public void escribir(int contador, String cadena) {
        try {
            RandomAccessFile arch = new RandomAccessFile(this.ruta, "rw");
            for (int i = 0; i < contador - 1; i++) {
                arch.readLine();
            }
            arch.writeBytes(cadena + "\r\n");
            arch.close();
        } catch (IOException e) {
            System.out.println(e);
        }
    }

}
