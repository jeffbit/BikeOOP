package main.electricbikecomponents

class Battery(
    val batterySize: Int,
    val batteryWeight: Double,
    val waterResistant: Boolean = false,
    var batteryLife: Int

) {

    fun resetBatteryLife(level: Int) {
        batteryLife = level
    }

    fun chargeBatteries(level: Int) {
        println("Battery is charging..... $batteryLife")
        batteryLife = level
        println("Battery Charged: $batteryLife")

    }
}
