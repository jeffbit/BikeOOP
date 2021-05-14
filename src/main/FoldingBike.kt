package main

import main.bikecomponents.Gears
import main.bikecomponents.Wheel

class FoldingBike(
    val foldingType: FoldingType,
    val bike: BikeData
) : Bike by bike {

}


sealed class FoldingType() {
    object HalfFold : FoldingType()
    object VerticalFold : FoldingType()
    object TriangleHinge : FoldingType()
    object BreakAway : FoldingType()
}