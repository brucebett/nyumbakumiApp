package com.example.nyumbakumiapp

import android.app.ProgressDialog
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AlertDialog

class MainActivity : AppCompatActivity() {
    lateinit var Edtemail:EditText
    lateinit var Edtpassword:EditText
    lateinit var Btnregister:Button
    lateinit var tvlogin:TextView
    lateinit var progress:ProgressDialog
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Edtemail = findViewById(R.id.edtname)
        Edtpassword = findViewById(R.id.edtpassword)
        Btnregister = findViewById(R.id.btnregister)
        tvlogin = findViewById(R.id.edttext2)
        progress = ProgressDialog(this,)
        progress.setTitle("loading")
        progress.setMessage("pleas wait.....")

        Btnregister.setOnClickListener {


        }
        tvlogin.setOnClickListener {
            startActivity(Intent(this,
                                  LoginActivity::class.java))
        }
    }
    fun displayMessage(title:String, message:String){
        var alertDialog = AlertDialog.Builder(this)
        alertDialog.setTitle(title)
        alertDialog.setMessage(message)
        alertDialog.setPositiveButton("ok", null)
        alertDialog.create().show()
    }
}