package com.example.exerciseskevinpiedra

class StringsOfText {

    val string1 = "Muy buenas a "

    fun main(){
        //concatenateStrings()
        //replaceChar
        //removeChar()
        //get2TimesTheFirst2letters("bocas", 2)
        //check2FirstChars("bocabo", 2)
        checkIfStringAreTheSame("hello")
    }

    fun concatenateStrings(){
        val string2 = "tod@s guapísim@s"
        println(string1 + string2)
    }
    fun replaceChar(){
        println(string1.replace('a', 'e'))
    }
    fun removeChar(){
        println(string1.replace("u", ""))
    }
    fun get2TimesTheFirst2letters(string3: String, numbersOfLettersToChange: Int){
        val firstTwoLetters = string3.substring(0,numbersOfLettersToChange) + string3.substring(0, numbersOfLettersToChange)
        val newString = firstTwoLetters + string3.substring(firstTwoLetters.length, string3.length)
        println(newString)
    }
    fun check2FirstChars(string3: String, numbersOfLettersToChange: Int){
        val firstTwoLetters = string3.substring(0,numbersOfLettersToChange)
        val twoLastLetters = string3.takeLast(2)
        if (firstTwoLetters == twoLastLetters){
            println(true)
        }else{println(false)}
    }
    fun checkIfStringAreTheSame(string3: String){
        val StringUpperCase = "HELLO"
        if (StringUpperCase.lowercase() == string3){
            println(true)
        }else{
            print(false)
        }
    }


}