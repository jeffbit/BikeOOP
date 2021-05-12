class Wheels(
    private val numberOfWheels: Int = 2,
    private val wheelSize: Int,
    private val wheelRimMaterial: RimMaterialType = RimMaterialType.Aluminum,
    private val tires: Tires

) {
}


sealed class RimMaterialType() {
    object Carbon : RimMaterialType()
    object Aluminum : RimMaterialType()
    object Titanium : RimMaterialType()

}