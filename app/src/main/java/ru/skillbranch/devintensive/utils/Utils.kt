package ru.skillbranch.devintensive.utils

object Utils {
    fun parseFullName (fullName: String?): Pair<String?,String?>{
        //TODO Исправить ошибку пустой строки(реализовано)
        if (fullName.equals("") or fullName.equals(" ")){
            return null to null
        }
        val parts : List<String>? = fullName?.split(" ")
        val firstName = parts?.getOrNull(0)
        val lastName = parts?.getOrNull(1)
        return firstName to lastName
    }
}