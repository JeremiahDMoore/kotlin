package com.example.kotlinbasics
// An abstract class cannot be instantiated directly
// (You CANNOT create objects of an abstract class).
// However, you CAN INHERIT subclasses from abstract classes
// The PROPERTIES and METHODS of an abstract class are NON-ABSTRACT
// UNLESS explicitly use the ABSTRACT KEYWORD to make them abstract
abstract class Mammal(private val name: String, private val origin: String,
                      private val weight: Double)  { // Concrete (non Abstract ) properties
    // Abstract Property (Must be overridden by Subclasses)
    abstract var maxSpeed: Double

    // AbstractMethods (must be implemented by Subclasses)
    abstract fun run()
    abstract fun breath()

    //Concrete (non Abstract) Method
    fun displayDetails() {
        print("\nName: $name\nOrigin: $origin\nWeight: $weight \nMax Speed: $maxSpeed\n")
    }
}
// Class Human extends Mammal, which is an ABSTRACT CLASS
class Human(name: String, origin: String, weight: Double, override var maxSpeed: Double): Mammal(name, origin, weight) {
    override fun run() { // overrides abstract function using override keyword, then defining the function algorithm
        //run details displayed to console
        print("\nruns on two legs")
    }
    override fun breath() { // overrides abstract function using override keyword, then defining the function algorithm
        // breath in is displayed to console
        print("\nbreathe in, breath out")
    }
}

class Elephant(name: String, origin: String, weight: Double, override var maxSpeed: Double): Mammal(name, origin, weight) {
    override fun run() { // overrides abstract function using override keyword, then defining the function algorithm
        print("\nruns on four legs")
    }
    override fun breath() { // overrides abstract function using override keyword, then defining the function algorithm
        print("\nJust breathe")
    }
}

fun main() { // defines variables of class type
    val human = Human("Butch","USA",185.0,10.5)
    val elephant = Elephant("Blumpko","India", 3600.0, 25.5)
    // val mammal = Mammal("Nutrag", "India", 69.7) ERROR THROWN: 'cannot create origin of abstract class' <==
    // runs function of class types here
    human.displayDetails()
    human.run()
    human.breath()

    elephant.displayDetails()
    elephant.run()
    elephant.breath()
}