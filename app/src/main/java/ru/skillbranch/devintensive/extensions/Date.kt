package ru.skillbranch.devintensive.extensions

import java.text.SimpleDateFormat
import java.util.*
import java.util.concurrent.TimeUnit

const val SECOND = 1000L
const val MINUTE = 60 * SECOND
const val HOUR = 60 * MINUTE
const val DAY = 24 * HOUR

fun Date.format(pattern: String = "HH:mm:ss dd.MM.yy") : String{
    val dateFormat = SimpleDateFormat(pattern, Locale("ru"))
    return dateFormat.format(this)
}

fun Date.add(value: Int,timeUnit: TimeUnits) : Date{
    var time = this.time
    time += when (timeUnit){
        TimeUnits.SECOND ->  value * SECOND
        TimeUnits.MINUTE -> value * MINUTE
        TimeUnits.HOUR -> value * HOUR
        TimeUnits.DAY -> value * DAY
        else -> throw IllegalStateException("invalid timeUnit")
    }
    this.time = time
    return this
}