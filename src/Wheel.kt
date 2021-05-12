data class Wheel(
    private val brake: Brake? = null,
    private val wheelSize: Int,
    private val wheelRimMaterial: RimMaterialType = RimMaterialType.Aluminum,
    private val tire: Tire

) {
}


sealed class RimMaterialType() {
    object Carbon : RimMaterialType()
    object Aluminum : RimMaterialType()
    object Titanium : RimMaterialType()

}