package main

import main.bikecomponents.Gears
import main.bikecomponents.Wheel

class RoadBike(
    val dropHandleBars: Boolean,
    val bike: BikeData
) : Bike by bike {

}