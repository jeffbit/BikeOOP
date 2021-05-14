package main

import main.bikecomponents.Gears
import main.bikecomponents.Wheel


class FoldingBike(
    val folding: Folding,
    val bike: Bike,
) : Bike by bike, Folding by folding {

}




