package com.rivera.daniel.usolayaoutsv4
import org.junit.Test
// Clase para el ejercicio
class Ejercicio01Kotlin {
    // Método que cuenta cuántas veces aparece cada letra en una palabra
    fun contarFrecuencia(palabra: String): Map<Char, Int> {
        // Usamos un mapa para guardar la frecuencia de cada letra
        val frecuencia = mutableMapOf<Char, Int>()
        // Iteramos sobre cada letra de la palabra
        for (caracter in palabra) {
            // Si la letra ya está en el mapa, sumamos uno
            if (frecuencia.containsKey(caracter)) {
                frecuencia[caracter] = frecuencia[caracter]!! + 1
            } else {
                // Si no está, la añadimos con un valor de 1
                frecuencia[caracter] = 1
            }
        }
        // Devolvemos el mapa con las frecuencias
        return frecuencia
    }
}
fun main() {// Función principal para probar el código
    // Creamos un objeto de la clase
    val ejercicio = Ejercicio01Kotlin()

    // Llamamos al método con la palabra "hello"
    val resultado = ejercicio.contarFrecuencia("hello")

    // Imprimimos el resultado en la consola
    println(resultado) // Debería mostrar: {h=1, e=1, l=2, o=1}
}
