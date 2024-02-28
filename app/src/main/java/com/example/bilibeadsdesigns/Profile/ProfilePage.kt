package com.example.bilibeadsdesigns.Profile

import android.annotation.SuppressLint
import android.content.Intent
import android.content.SharedPreferences
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.bilibeadsdesigns.AddToCart.CartActivity
import com.example.bilibeadsdesigns.Dashboard.Dashboard
import com.example.bilibeadsdesigns.HelpCenter.HelpCenter
import com.example.bilibeadsdesigns.LoginActivity
import com.example.bilibeadsdesigns.R

class ProfilePage : AppCompatActivity() {

    private lateinit var logoutButton: Button
    private lateinit var editProfile: Button
    private lateinit var changePass: Button
    private lateinit var tvUser: TextView
    private lateinit var tvEmail: TextView
    private lateinit var tvAddress: TextView

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_page_profile)

        logoutButton = findViewById(R.id.bt_logout)
        editProfile = findViewById(R.id.edit_profile)
        changePass = findViewById(R.id.change_pass)
        tvUser = findViewById(R.id.tvUser)
        tvEmail = findViewById(R.id.tvEmail)
        tvAddress = findViewById(R.id.tvAddress)

        loadUserData()

        logoutButton.setOnClickListener {
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
            Toast.makeText(this, "LogOut", Toast.LENGTH_SHORT).show()
        }

        editProfile.setOnClickListener {
            Toast.makeText(this, "Successfully Change", Toast.LENGTH_SHORT).show()
        }

        changePass.setOnClickListener {
            Toast.makeText(this, "Changed", Toast.LENGTH_SHORT).show()
        }

        val dashboard = findViewById<ImageView>(R.id.iv_logo)
        dashboard.setOnClickListener {
            val intent = Intent(this, Dashboard::class.java)
            startActivity(intent)
            finish()
        }

        val cart = findViewById<ImageView>(R.id.iv_cart)
        cart.setOnClickListener {
            val intent = Intent(this, CartActivity::class.java)
            startActivity(intent)
        }

        val helpCenter = findViewById<ImageView>(R.id.iv_profile)
        helpCenter.setOnClickListener {
            val intent = Intent(this, HelpCenter::class.java)
            startActivity(intent)
        }
    }

    private fun loadUserData() {
        val sharedPreferences = getSharedPreferences("UserData", MODE_PRIVATE)

        val user = sharedPreferences.getString("name", "")
        val email = sharedPreferences.getString("email", "")
        // Add more fields as needed

        tvUser.text = "User: $user"
        tvEmail.text = "Email: $email"
        // Update other TextViews with user data as needed
    }

    @SuppressLint("MissingSuperCall")
    @Deprecated("Deprecated in Java")
    override fun onBackPressed() {
        val intent = Intent(this, Dashboard::class.java)
        startActivity(intent)
        finish()
    }
}
