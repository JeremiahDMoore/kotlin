package com.example.kotlinbasics

import java.lang.IllegalArgumentException

class KotlinBasics

data class User(val id : Long, var name : String)


fun main() {
    val user1 = User(1, "PIZZABOY")
    var name = user1.name
    print(name)
    val user2 = User(1, "PIZZABOY")
    user2.name = "DUMPTRUCK"

    print(user1 == user2)

    print("\nUser details: $user1")

    val updatedUser = user1.copy(name = "updated")
    print(user1)
    print(updatedUser)
    print(updatedUser.component1())

    // creating instances of classes
//    var jeremiah = Person("Jeremiah", "Moore", age = 42)
//    jeremiah.stateHobby()
//    jeremiah.age = 42
//    jeremiah.stateAge()
//    var butch = Person()
//    butch.hobby = "Smoke weed"
//    butch.stateHobby()
//    butch.age = 42
//    butch.stateAge()
//    var tory = Person(lastName = "Garrido")
//    var myCar = Car()
//    print("\nVehicle brand is : ${myCar.myBrand}")
//    myCar.maxSpeed = 105
//    print("\nMax Speed of ${myCar.myBrand} is : ${myCar.maxSpeed}")
//    myCar.owner
//    print("\nVehicle model is : ${myCar.myModel}")
}

class Car() {
    lateinit var owner : String

    val myBrand : String = "Toyota"
    get() { //custom getter
        return field.toLowerCase()
    }

    var maxSpeed : Int = 100
        get() = field
        set(value) {
            field = if (value > 0)  value else throw IllegalArgumentException("value must be greater than 0")
        }
    var myModel : String = "4Runner"
        private set

    init {
        this.owner = "Franklin"
    }
}

class Person(firstName: String = "Butch", lastName: String = "Blunder") {
    // Member variables - Properties
    var age : Int? = null
    var hobby : String = "hiking"
    var firstName : String? = null

    // initialization block
    init {
        // this sets the variable to be passed down to the constructor
        this.firstName = firstName
        print("\nInitialized a new Person object with $firstName and $lastName")

    }
    // Member secondary constructor
    constructor(firstName: String, lastName: String, age : Int)
            : this(firstName, lastName) {
                this.age = age
        print("\nInitialized a new Person object with $firstName and $lastName and age $age")


        }
    fun stateAge() {
        print("\n$firstName\'s age is $age")
    }

    fun stateHobby() {
        print("\n$firstName\'s hobby is $hobby")
    }
}