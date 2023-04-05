package com.example.exerciseskevinpiedra

class ArraysAndObjects {
    fun main(){

        val classTogether = arrayOf(class1, class2)
        for (i in classTogether) {
            println(i)
        }
        printStudentsContainsA(classTogether)
        printStudentAreNotApprovedAndNotProgressing(classTogether)
        printStudentsNeedHelp(classTogether)
        printSuspendedStudents(classTogether)


    }

    class Student(val name: String, val age: Int, val marks: List<Int>, val isApproved: Boolean, val isProgressing: Boolean){
        val needHelp: Boolean = !isApproved && !isProgressing
    }

    class ClassExample(val name: String, val students: Array<Student>)
    val class1 = ClassExample("Cuarto", arrayOf(
        Student("Iria", 16, listOf(7, 8, 6), true, false),
        Student("Lolo", 15, listOf(9, 8, 9), true, true),
        Student("Paco", 14, listOf(7, 6, 7), true, true),
        Student("Miguel", 13, listOf(6, 7, 6), true, false),
        Student("Julia", 13, listOf(8, 9, 9), true, true),
        Student("Carlos", 12, listOf(7, 6, 7), true, true),
        Student("Laura", 11, listOf(5, 8, 5), true, false),
        Student("David", 12, listOf(8, 5, 0), false, false),
        Student("Ana", 11, listOf(7, 7, 8),true, true)
        ))

    val class2 = ClassExample("Segundo", arrayOf(
        Student("Valen", 13, listOf(6, 7, 6),true, false),
        Student("Alba", 13, listOf(8, 9, 9),true, true),
        Student("Juan", 12, listOf(7, 6, 7),true, true),
        Student("Messi", 10, listOf(8, 8, 7),true, false),
        Student("Elena", 11, listOf(7, 5, 8),true, true),
        Student("Manuel", 10, listOf(6, 7, 6),true, false),
        Student("Alicia", 11, listOf(8, 7, 8),true, true),
        Student("Javi", 10, listOf(9, 8, 9),true, true),
        Student("Spider", 11, listOf(7, 8, 7),true, false),
        Student("Ben", 12, listOf(8, 5, 0),false, false),
        )
    )

    private fun printStudentsContainsA(classTogether: Array<ClassExample>){
        for (i in classTogether) {
            println(i.name)
            for (j in i.students){
                if (j.name.contains('a')){
                    println(j.name)
                }
            }

        }
    }
    private fun printStudentAreNotApprovedAndNotProgressing(classTogether: Array<ClassExample>){
        for (i in classTogether) {
            println(i.name)
            for (j in i.students) {
                if (!j.isApproved && !j.isProgressing) {
                    println(j.name)
                }
            }
        }
    }
    private fun printStudentsNeedHelp(classTogether: Array<ClassExample>) {

        for (i in classTogether) {
            println(i.name)
            for (j in i.students) {
                if (!j.isApproved && !j.isProgressing) {
                    println(j.name)
                }
            }
        }
    }
    private fun printSuspendedStudents(classTogether: Array<ClassExample>){

        for (i in classTogether) {
            println(i.name)
            for (j in i.students) {
                if (!j.isApproved) {
                    println(j.name)
                }
            }
        }
    }


}