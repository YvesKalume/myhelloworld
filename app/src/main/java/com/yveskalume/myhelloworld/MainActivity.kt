package com.yveskalume.myhelloworld

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import java.nio.file.attribute.AclFileAttributeView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Toast.makeText(this,"Salut Moi c'est Yves Kalume et voici ma toute premiere application android",Toast.LENGTH_LONG).show()
        btnSaluer.setOnClickListener {
            val nom = formulaire.text
            textView.text="Hello $nom"
        }
    }
}
