package main

import main.bikecomponents.Shock
import main.electricbikecomponents.Battery
import main.electricbikecomponents.Electric
import main.electricbikecomponents.ElectricImpl
import main.mountainbikecomponents.Suspension
import main.mountainbikecomponents.SuspensionImpl

class ElectricFoldingMountainBike(
    val folding: Folding,
    val electric: Electric,
    val suspension: Suspension,
    val bike: Bike,
) : Bike by bike, Folding by folding, Electric by electric, Suspension by suspension {
}