package com.example.kotlinbasics

fun main() {
    val fruits = listOf("apple", "mango", "grape", "berry", "pineapple", "orange", "orange") // creates immutable list
    val arrayListOfFruits = ArrayList<String>(fruits) // changes to ArrayList<String> instead of adding one by one
    print("\nfruits$arrayListOfFruits") // many different ways to manupulate arrays

    val newFruits = fruits.toMutableList() // to mutable list
    newFruits.add("Watermelon")
    print("\nnewFruits$newFruits")

    val fruitsMap = mapOf("Fave" to Fruits("apple", 2.5), ("Best" to Fruits("pineapple", 4.5)))
    print("\nfruitsMap$fruitsMap") // a map of objects

    val daysOfTheWeek = mapOf(1 to "Monday", 2 to "Tuesday", 3 to "Wednesday", 4 to "Thursday") // map of key value pairs
    print("\n"+daysOfTheWeek[2])
    var average: Double = 0.0
    for (number in listOfNumbers) {
        average += number
    }
    val num = average / listOfNumbers.size
    print("\nAverage of $listOfNumbers is $num")
}

data class Fruits(val name: String, val price: Double)
val numbers = listOf(3.5, 4.6, 5.9, 6.8, 7.9)

val listOfNumbers = ArrayList<Double>(numbers)

// EXAMPLE CODE FROM CLASS BELOW
//fun main(){
//    val myArrayList: ArrayList<Double> = ArrayList()
//    myArrayList.add(13.212312)
//    myArrayList.add(23.151232)
//    myArrayList.add(32.651553)
//    myArrayList.add(16.223817)
//    myArrayList.add(18.523999)
//    var total = 0.0
//    for (i in myArrayList){
//        total += i
//    }
//    var average = total / myArrayList.size
//    println("Avarage is " + average)
//}

