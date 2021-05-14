package main

import main.bikecomponents.Shock
import main.electricbikecomponents.Battery
import main.electricbikecomponents.Electric
import main.mountainbikecomponents.Suspension

class ElectricMountainBike(
    override val motor: Motor,
    override val battery: Battery,
    override val frontSuspension: Shock,
    override val rearSuspension: Shock,
    val bike: BikeData,
) : Bike by bike, Electric, Suspension {

    init {
        println("Electric Mountain main.Bike: Electric Mountain main.Bike starting up")
    }


}