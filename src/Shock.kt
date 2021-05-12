data class Shock(
    private val travelAmount: Int = 0,
    private val adjustable: Boolean = false,
    private val shockType: ShockType = ShockType.Air,
    private val brand: String
) : AirPressure {

    fun adjustShock() {
        when (adjustable) {
            true -> println("Shock has been adjusted")
            false -> println("Shock is not adjustable")
        }

    }

    override fun increaseAirPressure() {
        TODO("Not yet implemented")
    }

    override fun decreaseAirPressure() {
        TODO("Not yet implemented")
    }
}


sealed class ShockType() {
    object Coil : ShockType()
    object Air : ShockType()
}