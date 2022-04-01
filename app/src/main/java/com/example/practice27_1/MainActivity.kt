package com.example.practice27_1

import android.app.ProgressDialog.show
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var fname:EditText=findViewById(R.id.fname)
        var lname:EditText=findViewById(R.id.lname)
        var btn:Button=findViewById(R.id.btn)

        btn.setOnClickListener {
            var str=fname.text.toString()
            var str1=lname.text.toString()
            Toast.makeText(applicationContext,"$str  $str1",Toast.LENGTH_LONG).show()
            fname.setText("")
            lname.setText("")

            var intent:Intent=Intent(applicationContext,SecondActivity::class.java)
            startActivity(intent)


        }

    }
}