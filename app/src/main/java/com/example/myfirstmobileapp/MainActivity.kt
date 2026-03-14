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

        // 1. Enable edge-to-edge display
        enableEdgeToEdge()

        // 2. Initialize View Binding
        binding = LayoutmainBinding.inflate(layoutInflater)

        // 3. Set the XML layout as the content (Removed setContent { ... })
        setContentView(binding.root)

        // 4. Initialize the text display so it doesn't start empty
        binding.txtcount.setText(counter.toString())

        // 5. Button Logic
        binding.resetbutton.setOnClickListener {
            counter += 1
            // Use setText() to avoid the "Editable!" type mismatch error
            binding.txtcount.setText(counter.toString())
        }

        binding.countbtn.setOnClickListener {
            counter = 0
            binding.txtcount.setText(counter.toString())
        }
    }
}
