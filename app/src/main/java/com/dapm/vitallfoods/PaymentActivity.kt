package com.dapm.vitallfoods

import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.dapm.vitallfoods.R


class PaymentActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_payment) // Asegúrate de que este es el layout correcto
        val btnPay = findViewById<Button>(R.id.btnPay)
        btnPay.setOnClickListener { // Mostrar el Toast
            Toast.makeText(this@PaymentActivity, "SU PAGO HA SIDO REALIZADO", Toast.LENGTH_LONG)
                .show()
        }
    }
}
