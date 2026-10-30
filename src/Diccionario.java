import java.util.HashMap;

public class Diccionario {

   public HashMap<String, String> crearDiccionario (){

        //Diccionario español-ingles
       //HashMao<Llave, valor>
        HashMap<String, String> diccionario = new HashMap<>();

        diccionario.put("gato", "cat");
        diccionario.put("perro", "dog");
        diccionario.put("casa", "house");
        diccionario.put("alberca", "pool");
        diccionario.put("ventana", "window");
        diccionario.put("silla", "chair");
        diccionario.put("cama", "bed");
        diccionario.put("baño", "bathroom");
        diccionario.put("libro", "book");
        diccionario.put("mochila", "backpack");
        diccionario.put("aire", "air");
        diccionario.put("agua", "water");
        diccionario.put("arena", "sand");
        diccionario.put("fuego", "fire");
        diccionario.put("mar", "ocean");
        diccionario.put("pez", "fish");
        diccionario.put("tiburón", "shark");
        diccionario.put("mapa", "map");
        diccionario.put("azul", "blue");
        diccionario.put("música", "music");

       return diccionario;
    }//crearDiccionario

}// class Diccionario
