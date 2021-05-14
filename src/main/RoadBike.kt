package main

import main.bikecomponents.Gears
import main.bikecomponents.Wheel

class RoadBike(
    val dropBars: DropBars,
    val bike: Bike
) : Bike by bike, DropBars by dropBars {

}


class DropBarsImp(
    override val dropHandleBars: DropBarsType
) : DropBars


interface DropBars {
    val dropHandleBars: DropBarsType
}


sealed class DropBarsType {
    object BullHorn : DropBarsType()
    object DropBars : DropBarsType()
    object AreoBars : DropBarsType()
}