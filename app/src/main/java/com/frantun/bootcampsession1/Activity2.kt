package com.frantun.bootcampsession1

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.frantun.bootcampsession1.MainActivity.Companion.TAG_MESSAGE
import com.frantun.bootcampsession1.model.Car
import com.frantun.bootcampsession1.util.move

class Activity2 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_2)

        val messageTextView = findViewById<TextView>(R.id.message_text_view)

        val messageReceived = intent.extras?.getString(TAG_MESSAGE)

        messageTextView.text = messageReceived

        val car2 = Car("", "", "")
        car2.move()
    }
}