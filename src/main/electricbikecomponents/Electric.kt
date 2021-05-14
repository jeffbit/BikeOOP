package main.electricbikecomponents

import main.Motor


class ElectricImpl(
    override val motor: Motor,
    override val battery: Battery
) : Electric


interface Electric {
    val motor: Motor
    val battery: Battery
}









