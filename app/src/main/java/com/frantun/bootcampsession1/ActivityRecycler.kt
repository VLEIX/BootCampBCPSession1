package com.frantun.bootcampsession1

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class ActivityRecycler: AppCompatActivity() {

    val listTeam = listOf("Daniela", "Danny", "Gerardo", "Joel")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_3)
        title = "List TEAM"
    }
}