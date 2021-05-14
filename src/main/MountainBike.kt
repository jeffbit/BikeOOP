package main

import main.mountainbikecomponents.Suspension

class MountainBike(
    val suspension: Suspension,
    val bike: BikeData
) : Bike by bike {


    fun returnSuspensionType() {
        print("Front shock brand ${suspension.getFrontSuspension?.getBrand}. Rear shock brand ${suspension.getRearSuspension?.getBrand}")
    }
}