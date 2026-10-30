
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

public class Traductor {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        Diccionario d = new Diccionario();
        HashMap<String, String> diccionario = d.crearDiccionario();


        ArrayList<String> listaPalabras = new ArrayList<>(diccionario.keySet()); // .keySet() saca todas las palabras en español (llaves) y las metemos en una lista en un ArrayList
        Collections.shuffle(listaPalabras); // revuelve la lista de forma aleatoria

        int correctas = 0;
        int incorrectas = 0;

        System.out.println("---TRADUCCION AL INGLÉS---");

        for (int i = 0; i < 5; i++) {
            String palabra = listaPalabras.get(i);

            System.out.print("Traduce al ingles '" + palabra + "': ");
            String respuesta = sc.nextLine().toLowerCase().trim();

            String traduccionCorrecta = diccionario.get(palabra); // .get busca en el diccionario la llave(palabra en español)
            // y devuelve el valor que tiene guardado (palabra en ingles)

            if (respuesta.equals(traduccionCorrecta)) {
                System.out.println("¡Correcto!");
                correctas++; // suma los aciertos
            } else {
                System.out.println("Incorrecto. La respuesta correcta es: " + traduccionCorrecta);
                incorrectas++; // suma los errores
            }
        }//for

        sc.close();

        // Resultados
        System.out.println("--- RESULTADOS ---");
        System.out.println("Correctas: " + correctas);
        System.out.println("Incorrectas: " + incorrectas);

    }//main
}//class Traductor
