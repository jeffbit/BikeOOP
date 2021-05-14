package main

import main.bikecomponents.Shock
import main.mountainbikecomponents.Suspension
import main.mountainbikecomponents.SuspensionImpl


class MountainBike(
    val suspension: Suspension,
    val bike: Bike
) : Bike by bike, Suspension by suspension {


    fun returnSuspensionType() {
        print("Front shock brand ${frontSuspension.getBrand}. Rear shock brand ${rearSuspension.getBrand}")
    }
}