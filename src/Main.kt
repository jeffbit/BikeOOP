fun main() {
    val mountainBike = MountainBike(
        size = Size.Large,
        frontWheel = Wheel(
            brake = Brake(
                pistonType = PistonType.DualPiston,
                brakePadMaterial = BrakePadMaterial.Metalic
            ),
            wheelSize = 29,
            wheelRimMaterial = RimMaterialType.Aluminum,
            tire = Tire(
                tireWidth = 2.6,
                tireMaterial = TireMaterial.Rubber,
                tubeLess = true
            )
        ),
        rearWheel = Wheel(
            brake = Brake(
                pistonType = PistonType.FourPiston,
                brakePadMaterial = BrakePadMaterial.Metalic
            ),
            wheelSize = 29,
            wheelRimMaterial = RimMaterialType.Aluminum,
            tire = Tire(
                tireWidth = 2.4,
                tireMaterial = TireMaterial.Rubber,
                tubeLess = true
            )
        ),
        suspension = Suspension(
            frontSuspension = Shock(
                travelAmount = 140,
                adjustable = true,
                shockType = ShockType.Air,
                brand = "Fox"
            ),
            rearSuspension = Shock(
                travelAmount = 140,
                adjustable = false,
                shockType = ShockType.Coil,
                brand = "EXT"
            )
        ),
        gears = Gears(
            frontChainRingSize = 1,
            rearCassetteSize = 12,
            brand = "Shimano"
        )
    )

    val roadBike = RoadBike(
        size = Size.Medium,
        frontWheel = Wheel(
            brake = Brake(
                pistonType = PistonType.SinglePiston,
                brakePadMaterial = BrakePadMaterial.Resin
            ),
            wheelSize = 27,
            wheelRimMaterial = RimMaterialType.Carbon,
            tire = Tire(
                tireWidth = 1.1,
                tireMaterial = TireMaterial.Kevlar,
                tubeLess = false
            )
        ), rearWheel = Wheel(
            brake = Brake(
                pistonType = PistonType.SinglePiston,
                brakePadMaterial = BrakePadMaterial.Resin
            ),
            wheelSize = 27,
            wheelRimMaterial = RimMaterialType.Carbon,
            tire = Tire(
                tireWidth = 1.1,
                tireMaterial = TireMaterial.Kevlar,
                tubeLess = false
            )
        ), gears = Gears(
            frontChainRingSize = 3,
            rearCassetteSize = 9,
            brand = "SRAM"
        )
    )


    val aBike = ABike(
        size = Size.Small, frontWheel = Wheel(
            wheelSize = 8,
            wheelRimMaterial = RimMaterialType.Aluminum,
            tire = Tire(
                tireWidth = 1.0,
                tireMaterial = TireMaterial.Rubber,
                tubeLess = false
            )
        ), rearWheel = Wheel(
            brake = Brake(
                pistonType = PistonType.SinglePiston,
                brakePadMaterial = BrakePadMaterial.Resin
            ),
            wheelSize = 8,
            wheelRimMaterial = RimMaterialType.Aluminum,
            tire = Tire(
                tireWidth = 1.0,
                tireMaterial = TireMaterial.Rubber,
                tubeLess = false
            )
        ), gears = Gears(
            frontChainRingSize = 1,
            rearCassetteSize = 1,
            brand = "A-Bike"
        )
    )


    val electricMountainBike = ElectricMountainBike(
        size = Size.Large,
        frontWheel = Wheel(
            brake = Brake(
                pistonType = PistonType.FourPiston,
                brakePadMaterial = BrakePadMaterial.MetalicResin
            ),
            wheelSize = 29,
            wheelRimMaterial = RimMaterialType.Carbon,
            tire = Tire(
                tireWidth = 3.0,
                tireMaterial = TireMaterial.Rubber,
                tubeLess = true
            )
        ),
        rearWheel = Wheel(
            brake = Brake(
                pistonType = PistonType.FourPiston,
                brakePadMaterial = BrakePadMaterial.MetalicResin
            ),
            wheelSize = 29,
            wheelRimMaterial = RimMaterialType.Carbon,
            tire = Tire(
                tireWidth = 3.0,
                tireMaterial = TireMaterial.Rubber,
                tubeLess = true
            )
        ),
        suspension = Suspension(
            frontSuspension = Shock(
                travelAmount = 170,
                adjustable = false,
                shockType = ShockType.Air,
                brand = "FOX"
            ),
            rearSuspension = Shock(
                travelAmount = 170,
                adjustable = false,
                shockType = ShockType.Air,
                brand = "FOX"
            ),
        ),
        gears = Gears(
            frontChainRingSize = 1,
            rearCassetteSize = 12,
            brand = "SRAM"
        )
    )


    println(mountainBike)
    println(roadBike)
    println(aBike)
    println(electricMountainBike)

}