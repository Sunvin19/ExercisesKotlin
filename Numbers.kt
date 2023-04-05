package com.example.exerciseskevinpiedra

class Numbers {
    private val x:Double = 3.0
    private val y:Double = 2.0
    fun main(){
        //sumNumbers()
        //multiplicationNumbers()
        //divisionNumbers()
        //exactDivisionNumbers()
        //getPercentageOfGamesWon()
        //getBiggerNumber()
        //calculatePrimeNumbers(5)
    }
    fun sumNumbers(){
        println(x + y)
    }
    fun getMultiplication(){
        println(x * y)
    }
    fun getDivision(){
        if (y != 0.0){
            println(x / y)
        }else{
            println(null)
        }
    }
    fun getExactDivision(){
        if (y != 0.0){
            val result = x/y
            println(result.toInt())
        }else{
            println(null)
        }
    }
    fun getPercentageOfGamesWon(){
        val gamesPlayed = 10
        val gamesWon = 9
        val percentageOfGamesWon = (gamesWon*100) / gamesPlayed
        println("$percentageOfGamesWon%")
    }
    fun getBiggerNumber(){
        if (x < y){
            println(y)
        }else if(x > y){
            println(x)
        }else{
            println("Are equal or this operation it's difficult")
        }
    }
    fun getMeasuresOfASwimmingPool(){
        val width  = 2
        val length = 4
        val height = 8
        println(width * length * height)

    }
    fun calculatePrimeNumbers(howMuchPrimeNumbers: Int) {
        var count = 0
        var number = 2

        while (count < howMuchPrimeNumbers) {
            var isPrime = true
            for (i in 2 until number) {
                if (number % i == 0) {
                    isPrime = false
                    break
                }
            }
            if (isPrime) {
                println(number)
                count++
            }
            number++
        }
    }
}
