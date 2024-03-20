package com.example.orgs

import android.os.Bundle
import android.widget.TextView
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.orgs.ui.theme.OrgsTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val nome =findViewById<TextView>(R.id.nome)
        nome.text = "Cesta de frutas"

        val descricao =findViewById<TextView>(R.id.descricao)
        descricao.text = "Laranja e Uva"

        val valor =findViewById<TextView>(R.id.nome)
        valor.text = "19.99"
    }
}

