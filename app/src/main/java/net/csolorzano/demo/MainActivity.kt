package net.csolorzano.demo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.btnIngresar)?.setOnClickListener {
            val mensaje = findViewById<TextView>(R.id.txtMensaje)

            val primerNombre = findViewById<EditText>(R.id.txtPrimerNombre)?.text.toString()
            val primerApellido = findViewById<EditText>(R.id.txtApellido)?.text.toString()

            if(primerNombre.isNotEmpty() && primerApellido.isNotEmpty()){
                val nombreCompleto = primerNombre.plus(" ").plus(primerApellido)
                mensaje?.text = "${getString(R.string.saludo)} ${nombreCompleto}"
            }else{
                Toast.makeText(this, getString(R.string.validacion), Toast.LENGTH_LONG).show()
            }
        }
    }
}