package br.com.moreira.androidviews

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    private var contador = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val textContador = findViewById<TextView>(R.id.activity_main_contador)
        val botaoAumentar = findViewById<Button>(R.id.activity_main_btb_aumentar)
        val botaoDiminuir = findViewById<Button>(R.id.activity_main_btb_diminuir)

        botaoAumentar.setOnClickListener{
            textContador.text = "${++contador}"
            //textContador.text = "${++contador}"
        }

        botaoDiminuir.setOnClickListener{
            textContador.text = "${--contador}"
            //textContador.text = "${contador--}"
        }
    }
}