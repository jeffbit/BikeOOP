class RoadBike(
    wheels: Wheels,
    brakes: Brakes,
    suspension: Suspension? = null,
    gears: Gears
) :
    Bike(wheels, brakes, suspension, gears) {
}