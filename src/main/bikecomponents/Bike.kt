package main

import main.bikecomponents.Gears
import main.bikecomponents.Wheel

//BikeImpl
data class BikeImpl(
    override val size: Size,
    override val frontWheel: Wheel,
    override val rearWheel: Wheel,
    override val gears: Gears
) : Bike {

    val returnSize: Size
        get() = size

    val returnFrontWheel: Wheel
        get() = frontWheel

    val returnRearWheel: Wheel
        get() = rearWheel

    val returnGears: Gears
        get() = gears


}

sealed class Size() {
    object ExtraSmall : Size()
    object Small : Size()
    object Medium : Size()
    object Large : Size()
    object ExtraLarge : Size()
}


interface Bike {
    val size: Size
    val frontWheel: Wheel
    val rearWheel: Wheel
    val gears: Gears
}


