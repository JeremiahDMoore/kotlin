package com.example.kotlinbasics

open class Vehicle {
    //properties
    //methods
}
// super class, parent class, or base class
open class NewCar(val name: String, val brand: String){
    open var range: Double = 0.0

    fun extendRange(amount: Double) {
        if (amount > 0)
            range += amount
    }
    open fun drive(distance: Double) {
        print("\nDrive: $distance")
    }

}
// sub class, child class or derived class of Vehicle
class ElectricCar(name: String, brand: String, batteryLife: Double) : NewCar(name, brand) {

    var chargerType = "Type1"
    override var range = batteryLife * 5

    override fun drive(distance: Double) {
        print("\nDrove: $distance KM on battery")
    }
    fun drive() {
        print("\nDrove: $range KM on battery")
    }

}

// Any class inherits from the Any class

fun main() {
    var myCar = NewCar("4Runner", "Toyota")
    var myECar = ElectricCar("Model S", "Tesla", 44.4)

    var obj : Any
    myECar.extendRange(200.0)
    myECar.chargerType = "Type2"
    // polymorphism
    myCar.drive(200.0)
    myECar.drive(240.0)
    myECar.drive()
}