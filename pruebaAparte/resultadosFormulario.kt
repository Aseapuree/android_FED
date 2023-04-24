package com.jampierre.my_application

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class resultados_formulario : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resultados_formulario)


        val tvResultado:TextView= findViewById(R.id.tvResultado)
        val nombreRecibido = intent.getStringExtra("enviarName")
        val apellRecibido= intent.getStringExtra("enviarApell")
        tvResultado.text="Nombre: "+nombreRecibido+"\nApellido: "+apellRecibido
        //val cambiarNombre = findViewById<>()






    }
}
