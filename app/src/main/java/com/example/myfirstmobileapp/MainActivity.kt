package com.example.myfirstmobileapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.enableEdgeToEdge
import com.example.myfirstmobileapp.databinding.LayoutmainBinding

class MainActivity : ComponentActivity() {


    private lateinit var binding: LayoutmainBinding
    var counter = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

      
        enableEdgeToEdge()

 
        binding = LayoutmainBinding.inflate(layoutInflater)

        
        setContentView(binding.root)

    
        binding.txtcount.setText(counter.toString())

   
        binding.resetbutton.setOnClickListener {
            counter += 1
         
            binding.txtcount.setText(counter.toString())
        }

        binding.countbtn.setOnClickListener {
            counter = 0
            binding.txtcount.setText(counter.toString())
        }
    }
}
