package main

import main.electricbikecomponents.Battery
import main.electricbikecomponents.Electric

class ElectricFoldingBike(
    override val foldingType: FoldingType,
    override val motor: Motor,
    override val battery: Battery,
    val bike: BikeData,
) : Bike by bike, Electric, Folding {

    init {
        println("Electric Folding Bike: Electric Folding Bike starting up")
    }


}