package main

import main.bikecomponents.Shock
import main.electricbikecomponents.Battery
import main.electricbikecomponents.Electric
import main.electricbikecomponents.ElectricImpl
import main.mountainbikecomponents.Suspension
import main.mountainbikecomponents.SuspensionImpl

class ElectricMountainBike(
    val electric: Electric,
    val suspension: Suspension,
    val bike: Bike,
) : Bike by bike, Electric by electric, Suspension by suspension {

    init {
        println("Electric Mountain main.Bike: Electric Mountain main.Bike starting up")
    }


}