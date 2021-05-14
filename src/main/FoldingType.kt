package main


class FoldingImpl(
    override val foldingType: FoldingType
) : Folding


interface Folding {
    val foldingType: FoldingType
}


sealed class FoldingType() {
    object HalfFold : FoldingType()
    object VerticalFold : FoldingType()
    object TriangleHinge : FoldingType()
    object BreakAway : FoldingType()
}