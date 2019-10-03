package io.github.gianpamx.calculator

import org.junit.Assert.assertEquals
import org.junit.Test

class CalculatorTest {

    @Test
    fun `Press button 1`() {
        val calculator = Calculator()

        val result = calculator.button(1)

        assertEquals("1", result)
    }

    @Test
    fun `Press button 2`() {
        val calculator = Calculator()

        val result = calculator.button(2)

        assertEquals("2", result)
    }

    @Test
    fun `Press button 3`() {
        val calculator = Calculator()

        val result = calculator.button(3)

        assertEquals("3", result)
    }

    @Test
    fun `Type 45`() {
        val calculator = Calculator()

        calculator.button(4)
        val result = calculator.button(5)

        assertEquals("45", result)
    }

    @Test
    fun `Sum 1+2`() {
        val calculator = Calculator()

        calculator.button(1)
        calculator.buttonPlus()
        calculator.button(2)
        val result = calculator.buttonEqual()

        assertEquals("3", result)
    }

    @Test
    fun `Keep the result from last operation to the next one`() {
        val calculator = Calculator()

        val result = `one plus three plus six`(calculator)

        assertEquals("10", result)
    }

    fun `one plus three plus six`(calculator: Calculator): String {
        calculator.button(1)
        calculator.buttonPlus()
        calculator.button(3)
        calculator.buttonEqual()
        calculator.buttonPlus()
        calculator.button(6)
        return calculator.buttonEqual()
    }

    @Test
    fun `Substract 1 from 5`() {
        val calculator = Calculator()

        calculator.button(5)
        calculator.buttonMinus()
        calculator.button(1)
        val result =calculator.buttonEqual()

        assertEquals("4", result)
    }
}
