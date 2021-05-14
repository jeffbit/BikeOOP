package main

class Motor(
    private var powerOutput: Int,
    private val motorType: MotorType
) {

    val getPowerOutPut: Int
        get() = powerOutput

    val getMotorType: MotorType
        get() = motorType

    fun adjustPowerOutput(level: Int): Boolean {
        return when (motorType) {
            MotorType.PedalAssist -> {
                powerOutput += level
                true
            }
            MotorType.Throttle -> {
                println("Motor type Throttle cannot be adjusted")
                false
            }

        }
    }

}


sealed class MotorType() {
    object PedalAssist : MotorType()
    object Throttle : MotorType()
}