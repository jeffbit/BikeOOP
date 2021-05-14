package main.mountainbikecomponents

import main.bikecomponents.Shock


class SuspensionImpl(
    override val frontSuspension: Shock,
    override val rearSuspension: Shock
) : Suspension {

}


interface Suspension {
    val frontSuspension: Shock
    val rearSuspension: Shock
}




