package main.mountainbikecomponents

import main.bikecomponents.Shock

class Suspension(
    private val frontSuspension: Shock? = null,
    private val rearSuspension: Shock? = null
) {
    val getFrontSuspension: Shock?
        get() = frontSuspension

    val getRearSuspension: Shock?
        get() = rearSuspension
}




