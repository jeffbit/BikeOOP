package electricbikecomponents

import main.Motor
import main.MotorType
import org.junit.Assert
import org.junit.Test

internal class MotorTest() {


    @Test
    fun `should return true when power output is adjusted on pedal assist motor`() {
        //given
        val motor = Motor(powerOutput = 50, motorType = MotorType.PedalAssist)
        //when
        val result = motor.adjustPowerOutput(level = 50)
        //then
        Assert.assertTrue(motor.getPowerOutPut == 100)
        Assert.assertTrue(result)

    }


    @Test
    fun `should return false when power output is adjusted on throttle motor`() {
        //given
        val motor = Motor(powerOutput = 20, motorType = MotorType.Throttle)
        //when
        val result = motor.adjustPowerOutput(level = 50)
        //then
        Assert.assertFalse(result)
        Assert.assertTrue(motor.getPowerOutPut == 20)

    }

}