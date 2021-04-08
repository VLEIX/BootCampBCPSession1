package com.frantun.bootcampsession1

import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.frantun.bootcampsession1.model.Car
import com.frantun.bootcampsession1.util.move

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val moveTo2Button = findViewById<Button>(R.id.move_to_activity_2_button)

        moveTo2Button.setOnClickListener {
//            val intent = Intent(this, Activity2::class.java)
//            intent.putExtra(TAG_MESSAGE, "hola, soy BCP lover!!")
//            startActivity(intent)
            moveCar()
        }
    }

    private fun moveCar() {
        val car = Car("Meteoro", "Lambo", "Max5")
        val messageCar = car.move()

        Toast.makeText(this, messageCar, Toast.LENGTH_SHORT).show()
    }

    companion object {
        const val TAG_MESSAGE = "TAG_MESSAGE"
    }
}