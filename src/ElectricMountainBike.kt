data class ElectricMountainBike(
    val size: Size,
    val frontWheel: Wheel,
    val rearWheel: Wheel,
    val suspension: Suspension,
    val gears: Gears,
    val motor: Motor = Motor(
        powerOutput = 500,
        battery = Battery(
            batterySize = 10800,
            batteryWeight = 9.8,
            waterResistant = true,
            batteryLife = 5
        ),
        motorType = MotorType.PedalAssist
    )
) :
    ElectricBike(size, frontWheel, rearWheel, suspension, gears, motor) {
    init {
        println("Electric Mountain Bike starting up")
    }
}