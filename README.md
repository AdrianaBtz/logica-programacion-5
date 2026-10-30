# 🧩 Ejercicio de Lógica de Programación 5

Programa en **Java** desarrollado como parte de los ejercicios de lógica de programación. Consiste en un minijuego interactivo de traducción de palabras del español al inglés utilizando estructuras de datos y buenas prácticas de programación orientada a objetos.

---

## Funcionalidades del Programa

1. **Diccionario de Palabras:** Almacena un catálogo de 20 palabras (Español-Inglés) utilizando un objeto **`HashMap`**.
2. **Selección Aleatoria:** Extrae las palabras del diccionario, las mezcla al azar (`Collections.shuffle()`) y selecciona automáticamente **5 palabras distintas** en cada ejecución.
3. **Interacción por Consola:** Solicita al usuario la traducción al inglés de cada palabra seleccionada.
4. **Validación y Conteo:** Compara la respuesta ingresada por el usuario (ignorando mayúsculas y espacios adicionales) y lleva un registro de las **respuestas correctas e incorrectas**.
5. **Resultados Finales:** Muestra en la consola un resumen con el puntaje total obtenido.

---

## Estructura del Proyecto

El proyecto está dividido en dos clases para mantener la separación de responsabilidades:

* **`Diccionario.java`**: Contiene la clase encargada de inicializar y proveer el `HashMap` con el vocabulario español-inglés.
* **`TraductorApp.java`**: Clase principal (`main`) que maneja la lógica del juego, la interacción con la consola (`Scanner`), la mezcla aleatoria y la validación de resultados.

---

## Tecnologías Utilizadas

* **Java** (JDK 17 o superior recomendado)
* **IntelliJ IDEA** (Entorno de desarrollo)
* **Git y GitHub** (Control de versiones)
