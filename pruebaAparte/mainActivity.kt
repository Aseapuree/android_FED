package com.jampierre.my_application

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView


class MainActivity  : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        //FindViewByld
        val btnConfirm: Button = findViewById(R.id.btnConfirm)
        val edtName: EditText = findViewById(R.id.edtNames)
        val edtSurename: EditText = findViewById(R.id.edtSurename)
        val message: TextView = findViewById(R.id.tvMessage)



        btnConfirm.setOnClickListener{

            //Mandamos a ver la segunda interfaz

            //Hemos obtenido los valores de nombre y apellido
            //val names= edtName.text.toString()
            //val sureName = edtSurename.text.toString()
            //val fullname= "Bienvenido a la aplicacion $names $sureName" //Concatenando
            //Mostrar el fullname

            //message.text= fullname



            //Enviar datos a otro activity
            val intent = Intent(this,resultados_formulario::class.java)
            val nombre:String=edtName.text.toString()
            val apell:String=edtSurename.text.toString()
            intent.putExtra("enviarName",nombre)
            intent.putExtra("enviarApell",apell)
            startActivity(intent)


        }

    }
}

