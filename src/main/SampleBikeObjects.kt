package main

import main.bikecomponents.*
import main.electricbikecomponents.Battery
import main.electricbikecomponents.Electric
import main.mountainbikecomponents.Suspension

val standardMountainBikeSuspension = Suspension(
    frontSuspension = Shock(
        travelAmount = 140,
        adjustable = true,
        shockType = ShockType.Air, brand = "FOX"
    ), rearSuspension = Shock(
        travelAmount = 140,
        adjustable = false,
        shockType = ShockType.Air, brand = "FOX"
    )
)

val standardTire = Tire(
    tireWidth = 2.0,
    tireMaterial = TireMaterial.Rubber,
    tubeLess = false
)
val standBikeBrake = Brake(
    pistonType = PistonType.SinglePiston,
    brakePadMaterial = BrakePadMaterial.Resin
)
val standardBikeWheel = Wheel(
    brake = standBikeBrake,
    wheelSize = 27,
    wheelRimMaterial = RimMaterialType.Aluminum,
    tire = standardTire
)
val standardGears = Gears(
    frontChainRingSize = 1,
    rearCassetteSize = 11,
    brand = "Shimano"
)

val standardBikeData = BikeData(
    size = Size.Medium,
    frontWheel = standardBikeWheel,
    rearWheel = standardBikeWheel,
    gears = standardGears
)

val standardMountainBike = MountainBike(
    suspension = standardMountainBikeSuspension,
    bike = standardBikeData
)

val standardRoadBike = RoadBike(
    dropHandleBars = true,
    bike = standardBikeData.copy(
        size = Size.Small,
        gears = Gears(
            frontChainRingSize = 3,
            rearCassetteSize = 12,
            brand = "SRAM"
        )
    )
)

val standardFoldingBike = FoldingBike(
    foldingType = FoldingType.HalfFold,
    bike = standardBikeData
)

val standardMotor = Motor(
    powerOutput = 500,
    motorType = MotorType.PedalAssist
)

val standardBattery = Battery(
    batterySize = 1000,
    batteryWeight = 9.0,
    waterResistant = false,
    batteryLife = 100
)

val standardElectricData = Electric(
    motor = standardMotor,
    battery = standardBattery
)


val standardElectricMountainBike = ElectricMountainBike(
    electric = standardElectricData,
    mountainBike = standardMountainBike
)

val standardElectricFoldingBike = ElectricFoldingBike(
    electricBike = standardElectricData,
    foldingBike = standardFoldingBike
)