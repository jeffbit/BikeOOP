import main.*
import main.electricbikecomponents.Battery
import main.electricbikecomponents.Electric
import main.electricbikecomponents.ElectricImpl

class ElectricFoldingBike(
    val electric: Electric,
    val folding: Folding,
    val bike: Bike,
) : Bike by bike, Folding by folding, Electric by electric {
    init {
        println("Electric Folding Bike: Electric Folding Bike starting up")
    }

}