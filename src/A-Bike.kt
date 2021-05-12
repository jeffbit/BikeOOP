data class ABike(
    private val foldingType: FoldingType = FoldingType.TriangleHinge,
    private val size: Size,
    private val frontWheel: Wheel,
    private val rearWheel: Wheel,
    private val gears: Gears
) : FoldingBike(
    foldingType, size, frontWheel, rearWheel, gears
) {

}
