package electricbikecomponents

import main.electricbikecomponents.Battery
import org.junit.Assert
import org.junit.Test
import org.junit.jupiter.api.Assertions.*

internal class BatteryTest(){



    @Test
    fun `should return correct battery level after charging`(){
        //given
        val battery = Battery(batterySize = 100, batteryWeight = 9.0, waterResistant = false, batteryLife = 20)
        //when
        battery.chargeBatteries(100)
        //then
        Assert.assertTrue(battery.batteryLife == 100)
    }

    @Test
    fun `when battery life is reset return true`(){
        //given
        val battery = Battery(batterySize = 100, batteryWeight = 9.0, waterResistant = false, batteryLife = 20)
        //when

        battery.resetBatteryLife(0)
        //then
        Assert.assertTrue(battery.batteryLife == 0)
    }
}