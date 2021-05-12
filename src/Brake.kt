data class Brake(
    private val pistonType: PistonType = PistonType.DualPiston,
    private val brakePadMaterial: BrakePadMaterial = BrakePadMaterial.Resin
) {
}


sealed class PistonType() {
    object DualPiston : PistonType()
    object SinglePiston : PistonType()
    object FourPiston : PistonType()
}


sealed class BrakePadMaterial() {
    object Metalic : BrakePadMaterial()
    object Resin : BrakePadMaterial()
    object MetalicResin : BrakePadMaterial()
}