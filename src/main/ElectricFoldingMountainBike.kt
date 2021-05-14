package main

import main.bikecomponents.Shock
import main.electricbikecomponents.Battery
import main.electricbikecomponents.Electric
import main.mountainbikecomponents.Suspension

class ElectricFoldingMountainBike(
    override val foldingType: FoldingType,
    override val motor: Motor,
    override val battery: Battery,
    override val frontSuspension: Shock,
    override val rearSuspension: Shock,
    val bike: BikeData,
    ) : Bike by bike, Folding, Electric, Suspension {
}