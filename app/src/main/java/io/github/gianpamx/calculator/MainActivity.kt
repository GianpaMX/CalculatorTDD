package io.github.gianpamx.calculator

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private val calculator = Calculator()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun onButtonClicked(v: View) {
        when (v.id) {
            R.id.button1 -> resultTextView.text = calculator.button(1)
            R.id.button2 -> resultTextView.text = calculator.button(2)
            R.id.button3 -> resultTextView.text = calculator.button(3)
            R.id.button4 -> resultTextView.text = calculator.button(4)
            R.id.button5 -> resultTextView.text = calculator.button(5)
            R.id.button6 -> resultTextView.text = calculator.button(6)
            R.id.button7 -> resultTextView.text = calculator.button(7)
            R.id.button8 -> resultTextView.text = calculator.button(8)
            R.id.button9 -> resultTextView.text = calculator.button(9)
            R.id.buttonPlus -> calculator.buttonPlus()
            R.id.buttonMinus -> calculator.buttonMinus()
            R.id.buttonEqual -> resultTextView.text = calculator.buttonEqual()
        }
    }
}
