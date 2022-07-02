package com.example.kotlinbasics

open class Vehicle {
    //properties
    //methods
}

interface Driveable {
    val maxSpeed: Double
    fun drive() : String
    fun brake() {
        print("\nThe driveable is braking!")
    }
}

// super class, parent class, or base class
open class NewCar(override val maxSpeed: Double, val name: String, val brand: String): Driveable {
    open var range: Double = 0.0

    fun extendRange(amount: Double) {
        if (amount > 0)
            range += amount
    }
    // override fun drive() : String = "driving the interface drive"
    override fun drive(): String {
        return "\ndriving the interface drive"
    }

    open fun drive(distance: Double) {
        print("\nDriving distance: $distance")
    }

}
// sub class, child class or derived class of Vehicle
class ElectricCar(maxSpeed: Double, name: String, brand: String, batteryLife: Double) : NewCar(maxSpeed, name, brand) {

    var chargerType = "Type1"
    override var range = batteryLife * 5

    override fun drive(distance: Double) {
        print("\nDrove: $distance KM on battery")
    }
    override fun drive(): String {
        return "\nDrove: $range KM on battery"
    }

    override fun brake() {
        super.brake()
        print("\nSlamming on the fucking brakeeeeee")
    }

}

// Any class inherits from the Any class

fun main() {
    var myCar = NewCar(100.0, "4Runner","Toyota")
    var myECar = ElectricCar( 185.0,"Model S", "Tesla", 44.4)
    myECar.brake()
    myCar.brake()
    var obj : Any
    myECar.extendRange(200.0)
    myECar.chargerType = "Type2"
    // polymorphism
    myCar.drive(200.0)
//    myECar.drive(240.0)
//    myECar.drive()
}