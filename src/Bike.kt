abstract class Bike(
    private val size: Size,
    private val frontWheel: Wheel,
    private val rearWheel: Wheel,
    private val suspension: Suspension? = null,
    private val gears: Gears
) {


    fun pedalBike() {
        println("Pedal Bike")
    }

    fun changeGears() {
        println("Shift Gears")
    }

}


sealed class Size() {
    object ExtraSmall : Size()
    object Small : Size()
    object Medium : Size()
    object Large : Size()
    object ExtralLarge : Size()
}