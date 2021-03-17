package beeasy.a90ms.actionsample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        showToast()
    }

    private fun showToast() {
        Toast.makeText(this, "text", Toast.LENGTH_LONG).show()
    }
}
