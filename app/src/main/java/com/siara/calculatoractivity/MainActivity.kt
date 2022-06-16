package com.siara.calculatoractivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout

class MainActivity : AppCompatActivity() {
    lateinit var tilNumber1: TextInputLayout
    lateinit var tilNumber2: TextInputLayout
    lateinit var etNumber1: TextInputEditText
    lateinit var etNumber2: TextInputEditText
    lateinit var btnAdd: Button
    lateinit var btnSub: Button
    lateinit var btnModulus: Button
    lateinit var btnDivide: Button
    lateinit var tvResult: TextView
    lateinit var btnCalculate:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        castviews()

    }




    fun castviews() {
        tilNumber1 = findViewById(R.id.tilNumber1)
        tilNumber2 = findViewById(R.id.tilNumber2)
        etNumber1 = findViewById(R.id.etNumber1)
        etNumber2 = findViewById(R.id.etNumber2)
        btnAdd = findViewById(R.id.btnAdd)
        btnDivide = findViewById(R.id.btnDivide)
        btnSub = findViewById(R.id.btnSub)
        btnModulus = findViewById(R.id.btnModulus)
        tvResult = findViewById(R.id.tvResult)
        btnCalculate=findViewById(R.id.btnCalculate)
        btnCalculate.setOnClickListener {
            validate()
        }

        btnDivide.setOnClickListener {
            var number = etNumber1.text.toString().toInt()
            var num = etNumber2.text.toString().toInt()
            division(number, num)


        }
        btnSub.setOnClickListener {
            var number = etNumber1.text.toString().toInt()
            var num = etNumber2.text.toString().toInt()
            sub(number, num)


        }
        btnModulus.setOnClickListener {
            var number = etNumber1.text.toString().toInt()
            var num = etNumber2.text.toString().toInt()
            modulus(number, num)


        }

        btnAdd.setOnClickListener {
            var number = etNumber1.text.toString().toInt()
            var num = etNumber2.text.toString().toInt()
            add(number, num)

        }






    }



    fun division(number1: Int, number2: Int) {
        var result = number1 / number2
        tvResult.text = result.toString()

    }

    fun add(number1: Int, number2: Int) {
        var result = number1 + number2
        tvResult.text = result.toString()

    }

    fun sub(number1: Int, number2: Int) {
        var result = number1 - number2
        tvResult.text = result.toString()


    }

    fun modulus(number1: Int, number2: Int) {
        var result = number1 % number2
        tvResult.text = result.toString()

    }

    fun validate() {
        tilNumber1.error = null
        tilNumber2.error = null
        var error = false
        var num1 = etNumber1.text.toString()
        if (num1.isBlank()) {
            tilNumber1.error = "Number is required"
            error = true
        }
        var num2 = etNumber2.text.toString()
        if (num2.isBlank()) {
            tilNumber2.error = "Second number is required"
            error = true
        }
        if (!error) {

        }
    }



}