package com.loteria.lotecol

import com.google.firebase.auth.FirebaseAuth
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.activity.ComponentActivity
import android.content.Intent
import android.graphics.Color
import android.os.Build
import androidx.core.content.ContextCompat

class HomeActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_home)  // Primero carga el layout

        val btnCerrarSesion = findViewById<View>(R.id.btnCerrarSesion)


        btnCerrarSesion.setOnClickListener {

            FirebaseAuth.getInstance().signOut()

            Toast.makeText(this, "Sesión cerrada", Toast.LENGTH_SHORT).show()

            // Abrir MainActivity (login)
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)

            // Cerrar HomeActivity para no volver con atrás
            finish()
        }
    }
}