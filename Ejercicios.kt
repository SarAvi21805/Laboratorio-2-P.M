/*
* Alejandra Avilés - 24722
* Tarea: Laboratorio 2
* Fecha: 19/07/2025
*/

/* 1. Función calcular promedio */
fun calcularPromedio(numeros: List<Double>): Double {
    val suma = numeros.reduce { acc, num -> acc + num }
    return suma / numeros.size
}

/* 2. Filtrar números impares */
val listaEnteros = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9)
val numerosImpares = listaEnteros.filter { it % 2 != 0 }

/* 3. Validación de palíndromos */
fun isPalindrome(cadena: String): Boolean {
    return cadena == cadena.reversed()
}

/* 4. Saludos a nombres con map */
val nombres = listOf("Alicia", "Juan", "Pedro")
val saludos = nombres.map { "¡Hola, $it!" }

/* 5. Operación con enteros y lambda */
fun performOperation(a: Int, b: Int, operation: (Int, Int) -> Int): Int {
    return operation(a, b)
}

/* 6. Definición de clases y convertir un objeto Person a uno Student */
data class Person(val name: String, val age: Int, val gender: String)
data class Student(val name: String, val age: Int, val gender: String, val studentId: String)

fun mapToStudent(person: Person, studentId: String): Student {
    return Student(person.name, person.age, person.gender, studentId)
}

fun main() {
    val numeros = listOf(10.0, 20.0, 30.0, 40.0, 50.0)
    val promedio = calcularPromedio(numeros)
    println("Ejercicio 1: El promedio es $promedio")
    println()

    val listaEnteros = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9)
    val numerosImpares = listaEnteros.filter { it % 2 != 0 }
    println("Ejercicio 2: Números impares son $numerosImpares")
    println()

    val cadena = "anilina"
    val esPalindromo = isPalindrome(cadena)
    println("Ejercicio 3: La cadena '$cadena' es palíndromo: $esPalindromo")
    println()

    val nombres = listOf("Alicia", "Juan", "Pedro")
    val saludos = nombres.map { "¡Hola, $it!" }
    println("Ejercicio 4: Saludos son $saludos")
    println()

    val a = 10
    val b = 5
    val suma = performOperation(a, b) { x, y -> x + y }
    println("Ejercicio 5: La suma de $a y $b es $suma")
    println()

    // Lista de personas
    val personas = listOf(
        Person("Alicia", 20, "Femenino"),
        Person("Juan", 22, "Masculino"),
        Person("Pedro", 21, "Masculino")
    )

    // Mapeo de personas a estudiantes
    val estudiantes = personas.mapIndexed { index, person ->
        mapToStudent(person, "S${index + 1}") // Asignamos un ID de estudiante
    }

    println("Ejercicio 6:")
    for (estudiante in estudiantes) {
        println("* El Estudiante ${estudiante.name} tiene ${estudiante.age} años.")
        println()
    }
}