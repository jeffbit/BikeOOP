package bikecomponents

import main.bikecomponents.Tire
import org.junit.Assert
import org.junit.Test
import org.junit.jupiter.api.Assertions.*

internal class TireTest() {


    @Test
    fun `should puncture and repair tire if rubber and not tubeless`() {
        //when
        val tire = Tire(tireWidth = 2.0, tireMaterial = Tire.TireMaterial.Rubber, tubeLess = false)
        val outcome = println("Please replace your innertube")
        //then
        val result = tire.punctureAndRepairTire()
        //assert
        Assert.assertTrue(result.equals(outcome))

    }
}