package com.example.monappli.presentation.main

import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.lifecycle.Observer
import com.example.monappli.R
import com.google.android.material.dialog.MaterialAlertDialogBuilder
import com.google.android.material.snackbar.Snackbar
import kotlinx.android.synthetic.main.activity_main.*
import org.koin.android.ext.android.inject

class MainActivity : AppCompatActivity() {

    val mainViewModel: MainViewModel by inject()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mainViewModel.loginLiveData.observe(this, Observer {
            when(it){
                is LoginSuccess -> {
                   // MaterialAlertDialogBuilder(this)
                     //   .setTitle("Success")
                       // .setMessage("Conection")
                        //.setPositiveButton("Ok") { dialog, which ->
                          //  dialog.dismiss()

                    val button = findViewById<Button>(R.id.login_button)
                    button.setOnClickListener{
                        val intent = Intent(this, NextActivity::class.java)
                        startActivity(intent)


                        }
                        //.show()
                }//Navigation
                LoginError -> {
                    MaterialAlertDialogBuilder(this)
                        .setTitle("Erreur")
                        .setMessage("compte incconu")
                        .setPositiveButton("Ok") { dialog, which ->
                            dialog.dismiss()
                        }
                        .show()
                }
            }
        })
        login_button.setOnClickListener {
            mainViewModel.onClickedLogin(login_edit.text.toString().trim(), password_edit.text.toString())
        }

        create_account_button.setOnClickListener{
            mainViewModel.onClickedCreate(login_edit.text.toString().trim(), password_edit.text.toString())
        }

      //  val button = findViewById<Button>(R.id.NextID)
        //button.setOnClickListener{
          //  val intent = Intent(this, NextActivity::class.java)
            //startActivity(intent)
        //val button2 = findViewById<Button>(R.id.NextID)
       val button2 = findViewById<Button>(R.id.NextID)
        button2.setOnClickListener {
            val snackBar = Snackbar.make(
                it, "Congratz you won a TROJAN HORSE",
                Snackbar.LENGTH_LONG
            ).setAction("Action", null)
            snackBar.setActionTextColor(Color.BLUE)
            val snackBarView = snackBar.view
            snackBarView.setBackgroundColor(Color.CYAN)
            val textView = snackBarView.findViewById(com.google.android.material.R.id.snackbar_text) as TextView
            textView.setTextColor(Color.BLUE)
            snackBar.show()
        }

    }

    }






