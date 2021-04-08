package com.frantun.bootcampsession1.util

import android.app.Activity
import com.frantun.bootcampsession1.model.Car

fun String.addBCP(): String {
    return "$this bcp extension"
}

fun Car.move(): String {
    return "moving ${this.name}..."
}

fun Activity.testExtension(): String {
    return ""
}