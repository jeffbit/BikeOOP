data class RoadBike(
    val size: Size,
    val frontWheel: Wheel,
    val rearWheel: Wheel,
    val gears: Gears
) :
    Bike(
        size, frontWheel, rearWheel, suspension = null, gears
    ) {

}