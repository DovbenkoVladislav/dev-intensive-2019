package ru.skillbranch.devintensive.utils

object Utils {
    fun parseFullName(fullName:String?) : Pair<String?, String?>{

        var parts:List<String>? = fullName?.split(" ")
        var firstName = parts?.getOrNull(0)
        var lastName = parts?.getOrNull(1)


        return Pair(presentPartOfFullName(firstName), presentPartOfFullName(lastName))

    }

    fun transliteration(payload: String?, divider:String = " "):String{
        return ""
    }

    fun toInitials(firstName: String?, lastName: String?): String? {
        return ""
    }
    private fun presentPartOfFullName(partOfFullName:String?):String? = if (partOfFullName is String && !partOfFullName.isBlank()) partOfFullName else null

}