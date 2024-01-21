package com.frantun.flutterintegration

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.frantun.flutterintegration.databinding.ActivityMainBinding
import io.flutter.embedding.android.FlutterActivity

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setListeners()
    }

    private fun setListeners() {
        binding.buttonOpenFlutterScreen.setOnClickListener {
            startActivity(
                FlutterActivity
                    .withCachedEngine("flutter_engine_id")
                    .build(this)
            )
        }
    }
}
