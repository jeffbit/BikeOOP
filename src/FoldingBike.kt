abstract class FoldingBike(
    private val foldingType: FoldingType,
    private val size: Size,
    private val frontWheel: Wheel,
    private val rearWheel: Wheel,
    private val gears: Gears
) : Bike(
    size, frontWheel, rearWheel, suspension = null, gears
) {

    fun storeBike() {
        println("Folding bike to to store in closet")
    }

}


sealed class FoldingType() {
    object HalfFold : FoldingType()
    object VerticalFold : FoldingType()
    object TriangleHinge : FoldingType()
    object BreakAway : FoldingType()
}