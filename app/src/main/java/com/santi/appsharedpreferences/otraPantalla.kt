package com.santi.appsharedpreferences

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import org.w3c.dom.Text

class otraPantalla : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_otra_pantalla)

        val user = findViewById<TextView>(R.id.user)
        val pass = findViewById<TextView>(R.id.pass)

        // se recupera la informacion que llega en el intent
        var miBundleUser: Bundle? = this.intent.extras
        var miBundlePass: Bundle ?= this.intent.extras

        //se asigan la informacion obtenida al textView
        if (miBundleUser != null){
            user.text= miBundleUser.getString("user")
        }

        if (miBundlePass != null){
            pass.text = miBundlePass.getString("pass")
        }

        val botonSalir: Button = findViewById(R.id.btnSalir)
        botonSalir.setOnClickListener {onClick()}

    }

    private  fun onClick() {
        finish()
    }

}