package com.example.diceroller

import org.junit.Test
import org.junit.Assert.assertTrue

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
//    @Test
//    fun addition_isCorrect() {
//        assertEquals(5, 3 + 2)
//    }
    @Test
    fun generate_number() {
    val dice = MainActivity.Dice(6)
    val rollResult = dice.roll()
        assertTrue("Value rollResult was not between 1 and 6 ",rollResult in 1..6)
    }


}