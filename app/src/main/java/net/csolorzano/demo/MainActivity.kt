package net.csolorzano.demo

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun crearColor(view: View) {
        var colorRojo = findViewById<EditText>(R.id.txtRojo)?.text.toString()
        var colorVerde = findViewById<EditText>(R.id.txtVerde)?.text.toString()
        var colorAzul = findViewById<EditText>(R.id.txtAzul)?.text.toString()

        if(colorRojo.isEmpty() or colorVerde.isEmpty() or colorAzul.isEmpty()){
            Toast.makeText(this, getString(R.string.msj_error), Toast.LENGTH_LONG).show()
        }else{
            if(colorRojo.length == 1)
                colorRojo = colorRojo + colorRojo
            if(colorVerde.length == 1)
                colorVerde = colorVerde.plus(colorVerde)
            if(colorAzul.length == 1)
                colorAzul = colorAzul + colorAzul

            val colorFinal = "#".plus(colorRojo).plus(colorVerde).plus(colorAzul)
            val colorComoInt = Color.parseColor(colorFinal)
            // "3.14" parseas = 3.14 (double)
            // "5" parsea = 5 (int)
            // "10/10/2020" parseas = 2020-10-10 (date)
            // #AABBFF =
            val vistaColor =findViewById<TextView>(R.id.txtColor)
            vistaColor?.setBackgroundColor(colorComoInt)
            vistaColor?.text = colorFinal
        }
    }
}