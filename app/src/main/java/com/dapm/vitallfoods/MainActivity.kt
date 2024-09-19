package com.dapm.vitallfoods
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button
import androidx.viewpager2.widget.ViewPager2
import com.dapm.vitallfoods.ImageSliderAdapter


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Encuentra el botón por su ID
        val btnCreditDebitCard: Button = findViewById(R.id.btnCreditDebitCard)
        val viewPager: ViewPager2 = findViewById(R.id.viewPagerImages)
        viewPager.adapter = ImageSliderAdapter(listOf(
            R.drawable.image1, // Asegúrate de tener estas imágenes en res/drawable
            R.drawable.image2,
            R.drawable.image3
        ))
        btnCreditDebitCard.setOnClickListener {
            // Crea un Intent para iniciar AddCardActivity
            val intent = Intent(this, AddCardActivity::class.java)
            startActivity(intent)
        }
    }
}
