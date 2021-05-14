package main

import ElectricFoldingBike
import main.bikecomponents.*
import main.bikecomponents.Tire.*
import main.electricbikecomponents.Battery
import main.electricbikecomponents.Electric
import main.electricbikecomponents.ElectricImpl
import main.mountainbikecomponents.Suspension
import main.mountainbikecomponents.SuspensionImpl

val standardMountainBikeShock = Shock(
    travelAmount = 140,
    adjustable = true,
    shockType = ShockType.Air, brand = "FOX"
)

val standardMountainBikeSuspension = SuspensionImpl(
    frontSuspension = standardMountainBikeShock,
    rearSuspension = standardMountainBikeShock
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

val standardBikeData = BikeImpl(
    size = Size.Medium,
    frontWheel = standardBikeWheel,
    rearWheel = standardBikeWheel,
    gears = standardGears
)

val standardMountainBike = MountainBike(
    suspension = standardMountainBikeSuspension,
    bike = standardBikeData
)


val standardDropBars = DropBarsImp(
    dropHandleBars = DropBarsType.AreoBars
)

val standardRoadBike = RoadBike(
    dropBars = standardDropBars,
    bike = standardBikeData.copy(
        size = Size.Small,
        gears = Gears(
            frontChainRingSize = 3,
            rearCassetteSize = 12,
            brand = "SRAM"
        )
    )
)
val standardFoldType = FoldingImpl(
    foldingType = FoldingType.HalfFold)

val standardFoldingBike = FoldingBike(
    folding = standardFoldType,
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

val standardElectric = ElectricImpl(
    motor = standardMotor,
    battery = standardBattery
)
val standardElectricMountainBike = ElectricMountainBike(
    electric = standardElectric,
    suspension = standardMountainBikeSuspension,
    bike = standardBikeData

)

val standardElectricFoldingBike = ElectricFoldingBike(
    bike = standardBikeData,
    electric = standardElectric,
    folding = standardFoldType
)