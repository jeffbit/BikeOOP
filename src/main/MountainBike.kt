package main

import main.bikecomponents.Shock
import main.mountainbikecomponents.Suspension


class MountainBike(
    override val frontSuspension: Shock,
    override val rearSuspension: Shock,
    val bike: BikeData
) : Bike by bike, Suspension {


    fun returnSuspensionType() {
        print("Front shock brand ${frontSuspension?.getBrand}. Rear shock brand ${rearSuspension?.getBrand}")
    }
}