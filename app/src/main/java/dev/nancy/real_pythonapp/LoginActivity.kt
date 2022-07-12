package dev.nancy.real_pythonapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout

class LoginActivity : AppCompatActivity() {
    lateinit var tilUserName:TextInputLayout
    lateinit var etUserName:TextInputEditText
    lateinit var tilPassword:TextInputLayout
    lateinit var etPassword:TextInputEditText
    lateinit var btnLogin:Button
    lateinit var tilConfirmPassword:TextInputLayout
    lateinit var etConfirmPassword:TextInputEditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        castViews()
    }
    fun castViews(){
        tilUserName=findViewById(R.id.tilUsername)
        etUserName=findViewById(R.id.etUserName)
        tilPassword=findViewById(R.id.tilPassword)
        etPassword=findViewById(R.id.etPassword)
        tilConfirmPassword=findViewById(R.id.tilConfirmPassword)
        etConfirmPassword=findViewById(R.id.etConfirmPassword)
        btnLogin=findViewById(R.id.btnLogin)
        btnLogin.setOnClickListener { Validating() }
    }
    fun Validating(){
        var error=false
        tilUserName.error=null
        tilPassword.error=null
        tilConfirmPassword.error=null
        var username=etUserName.text.toString()
        if (username.isBlank()){
            tilUserName.error="username is required"
            }
        var password=etPassword.text.toString()
        if (password.isBlank()){
            tilPassword.error="password is required"
        }
        var confirmpassword=etConfirmPassword.text.toString()
        if (confirmpassword.isBlank()){
            tilConfirmPassword.error="Invalid password"
        }
        if (password != confirmpassword)
            tilConfirmPassword.error="wrong password"
    }
}