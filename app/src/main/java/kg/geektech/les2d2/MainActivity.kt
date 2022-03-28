package kg.geektech.les2d2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kg.geektech.les2d2.databinding.ActivityMainBinding
import kg.geektech.les2d2.extensions.loadImage
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
     private lateinit var binding: ActivityMainBinding
     private  val imageList = arrayListOf("https://i.imgur.com/L1I6hwd.jpeg",
         "https://i.imgur.com/PRUdPlu.jpeg",
         "https://i.imgur.com/I9FzFWm.jpeg",
         "https://i.imgur.com/oEGAXQF_d.webp?maxwidth=760&fidelity=grand")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btn2.setOnClickListener {
            val randomIndex = Random.nextInt(imageList.size)
            val randomElement = imageList[randomIndex]
            binding.imV.loadImage(randomElement)
        }
        binding.btn1.setOnClickListener {
            imageList.add(binding.edT.text.toString())
        }
    }
}