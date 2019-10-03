package io.github.gianpamx.calculator

class Calculator {
    private enum class Operation {
        SUM,
        SUBTRACTION
    }

    private var leftNumber: Int = 0
    private var rightNumber: Int = 0

    private val LEFT = 0
    private val RIGHT = 1

    private var currentNumber = LEFT

    private var currentOperation : Operation? = null

    fun button(number: Int): String {
        if (currentNumber == LEFT) {
            leftNumber = leftNumber * 10 + number
            return leftNumber.toString()
        } else {
            rightNumber = rightNumber * 10 + number
            return rightNumber.toString()
        }
    }

    fun buttonPlus() {
        currentNumber = RIGHT
        currentOperation = Operation.SUM
    }

    fun buttonMinus() {
        currentNumber = RIGHT
        currentOperation = Operation.SUBTRACTION
    }

    fun buttonEqual(): String {
        val result = when(currentOperation) {
            Operation.SUM -> leftNumber + rightNumber
            Operation.SUBTRACTION -> leftNumber - rightNumber
            else -> leftNumber
        }

        currentNumber = LEFT
        leftNumber = result
        rightNumber = 0
        return result.toString();
    }
}
