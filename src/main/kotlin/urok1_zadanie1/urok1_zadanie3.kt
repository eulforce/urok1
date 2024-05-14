package org.example.urok1_zadanie1

import java.sql.Time

fun main(){
    val year: Int = 1961
    var hour = "09"
    //комментировать это не надо, а вывести, и потом эту переменную заменить на новые данные.
    var minute = "07"

    //println(year)
    //println(hour)
    //println(minute)
    //println("%02d".format(hour))
    // Хорошо что знаешь про использования format для вывод 2 знаков.
    // Вообще нормальная практика, если сервер присылает дату или время строкой.
    // Давай объявим строки и сделаем правильный формат)
    //println("%02d".format(minute))
    hour = "10"
    minute = "55"
    println("$hour:$minute")
    //print(hour)
    //print(minute)





}