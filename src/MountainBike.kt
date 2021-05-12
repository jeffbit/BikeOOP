data class MountainBike(
    val size: Size,
    val frontWheel: Wheel,
    val rearWheel: Wheel,
    val suspension: Suspension,
    val gears: Gears
) : Bike(
    size, frontWheel, rearWheel, suspension, gears
) {


}