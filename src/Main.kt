fun main() {
    val mountainBike = MountainBike(
        wheels = Wheels(
            numberOfWheels = 2,
            wheelSize = 29,
            wheelRimMaterial = RimMaterialType.Carbon,
            tires = Tires(
                tireWidth = 2.3,
                tireMaterial = TireMaterial.Rubber,
                tubeLess = true
            )
        ),
        brakes = Brakes(
            pistonType = 4, brakeMaterial = "Metal/Resin"
        ),
        suspension = Suspension(
            frontSuspension = Shock(
                travelAmount = 160,
                adjustable = false,
                brand = "Fox"
            ),
            rearSuspension = Shock(
                travelAmount = 140,
                adjustable = true, brand = "Fox"
            )
        ),
        gears = Gears
            (
            frontChainRingSize = 1,
            rearCassetteSize = 12,
            brand = "Shimano"
        )
    )

    val roadBike = RoadBike(
        wheels = Wheels(
            numberOfWheels = 2,
            wheelSize = 27,
            wheelRimMaterial = RimMaterialType.Titanium,
            tires = Tires(tireWidth = 1.0, tireMaterial = TireMaterial.Kevlar, tubeLess = false)
        ),
        brakes = Brakes(pistonType = 2, brakeMaterial = "Resin"),
        suspension = null,
        gears = Gears(frontChainRingSize = 3, rearCassetteSize = 12, brand = "SRAM")
    )


    println(mountainBike)
    println(roadBike)

}