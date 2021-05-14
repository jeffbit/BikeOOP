package mountainbikecomponents

import main.bikecomponents.Shock
import main.bikecomponents.ShockType
import org.junit.Assert
import org.junit.Test
import org.junit.jupiter.api.Assertions.*

internal class ShockTest {


    @Test
    fun `should return true when shock is adjustable`() {
        //given
        val shock = Shock(travelAmount = 140, adjustable = true, shockType = ShockType.Air, brand = "Fox")
        //when
        val result = shock.adjustShock()
        //then
        val outPut = println("Shock has been adjusted")
        Assert.assertTrue(result.equals(outPut))
    }



    @Test
    fun `should return true if shock is upgradable`(){
        //given
        val shock = Shock(travelAmount = 140, adjustable = false, shockType =ShockType.Air, brand = "Fox")
        //when
        val result = shock.isUpgradable()
        //then
        Assert.assertTrue(result)
    }

    @Test
    fun `should return false if shock is not upgradeable`(){
        //given
        val shock = Shock(travelAmount = 120, adjustable = false, shockType =ShockType.Coil, brand = "Fox")
        //when
        val result = shock.isUpgradable()
        //then
        Assert.assertFalse(result)
    }
}