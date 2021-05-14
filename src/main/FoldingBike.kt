package main

import main.bikecomponents.Gears
import main.bikecomponents.Wheel


class FoldingBike(
    override val foldingType: FoldingType,
    val bike: BikeData,
) : Bike by bike, Folding {

}




