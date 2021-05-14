package main.bikecomponents

data class Tire(
    private val tireWidth: Double,
    private val tireMaterial: TireMaterial = TireMaterial.Rubber,
    private val tubeLess: Boolean = false

) : AirPressure {

    fun punctureAndRepairTire() {
        when (tubeLess) {
            true -> {
                when (tireMaterial) {
                    TireMaterial.Kevlar -> println("main.bikecomponents.Tire cannot be punctured")
                    TireMaterial.Rubber -> println("main.bikecomponents.Tire needs more sealant to fix puncture")
                }
            }
            false -> {
                when (tireMaterial) {
                    TireMaterial.Kevlar -> println("main.bikecomponents.Tire cannot be punctured")
                    TireMaterial.Rubber -> println("Please replace your innertube")
                }

            }
        }
    }

    override fun increaseAirPressure() {
        TODO("Not yet implemented")
    }

    override fun decreaseAirPressure() {
        TODO("Not yet implemented")
    }
}


sealed class TireMaterial() {
    object Kevlar : TireMaterial()
    object Rubber : TireMaterial()
}