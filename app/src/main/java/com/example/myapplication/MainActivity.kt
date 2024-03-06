package com.example.myapplication
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.EditText
import android.widget.RadioButton
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity



class MainActivity : AppCompatActivity() {

    lateinit var tuResultado:TextView
    lateinit var edNum1: EditText
    lateinit var edNum2: EditText
    lateinit var rdSuma:RadioButton
    lateinit var rdResta:RadioButton
    lateinit var rdMulti:RadioButton
    lateinit var rdDivi:RadioButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        tuResultado =findViewById(R.id.tuResultado)
        edNum1 =findViewById(R.id.edNum1)
        edNum2 =findViewById(R.id.edNum2)
        rdSuma =findViewById(R.id.rdSuma)
        rdResta =findViewById(R.id.rdResta)
        rdMulti =findViewById(R.id.rdMulti)
        rdDivi =findViewById(R.id.rdDivi)
    }
    fun accionClick(view:View){
        val num1= edNum1.text.toString().toInt()
        val num2= edNum2.text.toString().toInt()
        var resultado =0
        if(rdSuma.isChecked){
            resultado = num1 + num2
        }else if (rdResta.isChecked){
            resultado = num1 - num2
        }else if (rdMulti.isChecked){
            resultado = num1 * num2
        }else{
            resultado = num1 / num2
        }
        tuResultado.text= "$resultado"
    }
}