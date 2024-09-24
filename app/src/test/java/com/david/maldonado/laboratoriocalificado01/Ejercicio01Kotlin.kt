// Paquete donde está ubicada la clase
package com.david.maldonado.laboratoriocalificado01

// Clase que contiene el método para contar la frecuencia de caracteres
class Ejercicio01Kotlin {

    // Método que recibe una palabra y devuelve un mapa con la frecuencia de cada carácter
    fun contarFrecuencia(palabra: String): Map<Char, Int> {
        // Crear un mapa mutable para almacenar la frecuencia de cada carácter
        val frecuencia = mutableMapOf<Char, Int>()

        // Recorrer cada carácter de la palabra
        for (char in palabra) {
            // Si el carácter ya está en el mapa, incrementar su contador
            // Si no, agregarlo al mapa con un contador inicial de 1
            frecuencia[char] = frecuencia.getOrDefault(char, 0) + 1
        }

        // Devolver el mapa con la frecuencia de los caracteres
        return frecuencia
    }
}

// Ejemplo de uso
fun main() {
    // Crear una instancia de la clase Ejercicio01Kotlin
    val ejercicio = Ejercicio01Kotlin()

    // Probar la función contarFrecuencia con la palabra "hello"
    val resultado = ejercicio.contarFrecuencia("hello")

    // Imprimir el resultado
    println(resultado)  // Salida: {h=1, e=1, l=2, o=1}
}