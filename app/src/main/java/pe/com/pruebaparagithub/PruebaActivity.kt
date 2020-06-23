package pe.com.pruebaparagithub

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_prueba.*

class PruebaActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_prueba)

        btnAceptar.setOnClickListener {
            txtTexto.text = "Hola DAMI"
        }

    }
}
