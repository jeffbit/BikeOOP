abstract class ElectricBike(
    size: Size,
    frontWheel: Wheel,
    rearWheel: Wheel,
    suspension: Suspension,
    gears: Gears,
    motor: Motor
) :
    Bike(size, frontWheel, rearWheel, suspension, gears) {

    init {
        println("Please read local laws to see if Electric Bikes are allowed in your area")
    }
}


data class Motor(
    private val powerOutput: Int,
    private val battery: Battery,
    private val motorType: MotorType
) {

}


data class Battery(
    private val batterySize: Int,
    private val batteryWeight: Double,
    private val waterResistant: Boolean = false,
    private val batteryLife: Int

) {

}


sealed class MotorType() {
    object PedalAssist : MotorType()
    object Throttle : MotorType()
}