package main.bikecomponents

import main.Brake

class Wheel(
    private val brake: Brake,
    private val wheelSize: Int,
    private val wheelRimMaterial: RimMaterialType = RimMaterialType.Aluminum,
    private val tire: Tire

) {


    val getWheelSize: Int
        get() = wheelSize

    val getRimMaterial: RimMaterialType
        get() = wheelRimMaterial

    val getTire: Tire
        get() = tire

    val getBrake: Brake
        get() = brake
}


sealed class RimMaterialType() {
    object Carbon : RimMaterialType()
    object Aluminum : RimMaterialType()
    object Titanium : RimMaterialType()

}