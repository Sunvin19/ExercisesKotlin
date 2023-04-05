package com.example.exerciseskevinpiedra

class Arrays {
    fun main() {
        //Number of position and number you want to put
        //insertNumberInPosition(2, 3)

        //numberExits(7)

        //repeatedNumber(5)

        //orderFromHighToLow()

        //arrayAddString("improve.")

        //val result = getFirstNumberInRangeNotInArray2()
        //println("El primer número en el rango que no está en el array es: $result")

        //getFirstNumberInRangeNotInArray()
    }

    val array1 = intArrayOf(5, 10, 100, 5, 3)

    fun insertNumberInPosition(index: Int, number: Int): IntArray {

//Create 2 arrays
        val array2 = IntArray(array1.size + 1)
        //Index = position od Array
        //loop to traverse the array
        for (i in array1.indices) {
            //if index of array1 is less than index (number introduced)
            if (i < index) {
                //copy the same value of the array
                array2[i] = array1[i]
            } else {
                //add 1 to the index of the array for move the value to the next position
                array2[i + 1] = array1[i]
            }
        }
        //Insert number in the position given of index
        array2[index] = number

        for (i in array1.indices) {
            println(array1[i])
        }//Another way to print the array
        for (value in array2) {
            println(value)
        }
        return array2
    }

    fun numberExits(number: Int) {
        for (value in array1) {
            println(value)
        }//One way
        if (number in array1) {
            println("The number is in the array")
        } else {
            println("The number is not in the array")
        }
        //Another way
        if (array1.contains(number)) {
            println("The number is in the array")
        } else {
            println("The number is not in the array")
        }

    }

    fun repeatedNumber(number: Int) {
        var count = 0
        println(array1.count() == number)
        for (value in array1) {
            println(value)

            if (value == number) {
                count++
            }
        }
        println("The number is repeated $count times")
    }

    fun orderFromHighToLow() {

        // Recorrer cada elemento del arreglo
        for (i in array1.indices) {
            //println(i)
            // Recorrer los elementos restantes del arreglo
            for (j in i + 1 until array1.size) {
                // Si el elemento es mayor lo intercambia
                if (array1[j] > array1[i]) {
                    val changePosition = array1[i]
                    array1[i] = array1[j]
                    array1[j] = changePosition
                }
            }
        }
        /*
    La variable i recorre los índices del arreglo array1 mediante el uso del método indices.
    Dentro del primer for, se recorren los elementos restantes del arreglo array1 a partir de la posición i + 1,
    mediante un segundo for que utiliza el operador until.

    En cada iteración del segundo for, se compara el elemento actual array1[j] con el elemento anterior array1[i].
    Si el elemento actual es mayor, se intercambian las posiciones de los elementos para que el mayor quede antes en el arreglo.

    De esta manera, en cada iteración del primer for, el mayor elemento no ordenado se coloca en la posición correcta.
    El algoritmo continua iterando hasta que todos los elementos del arreglo estén ordenados.
     */
        for (i in array1) {
            println(i)
        }

    }

    fun arrayAddString(newString: String) {
        var arrayOfStrings = arrayOf("I", "want", "to")
        arrayOfStrings =
            arrayOfStrings.plus(newString)//Function plus for add the new string or list
        for (i in arrayOfStrings) {
            println(i)
        }
    }


/*
private fun getFirstNumberInRangeNotInArray() {
    val array1000000 = intArrayOf(1, 2, 3, 4, 5, 6, 18)
    var result = null
    for (i in 1..1000000) {
        if (i !in array1000000){
            println(i)
        }
    }
}
*/
/* return
private fun getFirstNumberInRangeNotInArray2(): Int? {
    val array1000000 = intArrayOf(1, 2, 3, 4, 5, 6, 18)
    for (i in 1..1000000) {
        if (i !in array1000000) return i
    }
    return null
}

 */
}