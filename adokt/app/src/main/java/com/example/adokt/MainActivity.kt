package com.example.adokt

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.RadioButton
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonSend = findViewById<Button>(R.id.Jogar)

        buttonSend.setOnClickListener {
            val caraRadioButton = findViewById<RadioButton>(R.id.cara)
            val coroaRadioButton = findViewById<RadioButton>(R.id.coroa)

            if (caraRadioButton.isChecked || coroaRadioButton.isChecked) {
                val escolhaUsuario = if (caraRadioButton.isChecked) "cara" else "coroa"

                val intent = Intent(this, MainActivity2::class.java)
                intent.putExtra("jogada", escolhaUsuario)
                startActivity(intent)
            } else {
                Toast.makeText(this, "Selecione uma opção", Toast.LENGTH_SHORT).show()
            }
        }
    }
}
