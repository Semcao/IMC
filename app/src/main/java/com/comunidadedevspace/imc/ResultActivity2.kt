package com.comunidadedevspace.imc

import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

const val KEY_RESULT_IMC = "ResultActivity2.KEY_IMC"

class ResultActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_result2)


        val result = intent.getFloatExtra(KEY_RESULT_IMC,0f)
        val tvresult = findViewById<TextView>(R.id.tv_result)
        val tvclassificacao = findViewById<TextView>(R.id.tv_classificacao)
        tvresult.text = result.toString()

        val classificacao: String = if (result <= 18.5f) {
            "MAGREZA"
        }else if ( result > 18.5F && result <= 24.9f) {
            "NORMAL"
        }else if ( result > 25F && result <= 29.9f) {
            "SOBREPESO"
        }else if ( result > 30 && result <= 39.9f) {
            "OBESIDADE"
        }else {
            "OBESIDADE GRAVE"
        }
        tvclassificacao.text = classificacao
        }
    }
