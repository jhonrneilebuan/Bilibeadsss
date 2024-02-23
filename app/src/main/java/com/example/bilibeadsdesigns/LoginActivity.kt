package com.example.bilibeadsdesigns

import android.content.Intent
import android.database.sqlite.SQLiteDatabase
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.RelativeLayout
import android.widget.Toast
import androidx.core.content.ContextCompat
import com.example.bilibeadsdesigns.AddToCart.DatabaseHelper
import com.example.bilibeadsdesigns.Dashboard.Dashboard
import com.example.bilibeadsdesigns.databinding.ActivityPageLoginBinding
import com.example.loginactivity.DBHelper
import com.jakewharton.rxbinding2.widget.RxTextView

class LoginActivity : AppCompatActivity() {

    private lateinit var createAccount: RelativeLayout
    private lateinit var username: EditText
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_page_login)

        createAccount = findViewById(R.id.create_account)

        createAccount.setOnClickListener{
            val intent = Intent(this, RegistrationActivity::class.java)
            startActivity(intent)
        }

    }


}