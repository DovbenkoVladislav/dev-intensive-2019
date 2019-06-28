package ru.skillbranch.devintensive.models

import java.util.*

class User(
    val id:String,
    var firstName:String?,
    var lastName:String?,
    var avatar:String?,
    var rating:Int = 0,
    var respect:Int = 0,
    val lastVisit:Date? = null,
    val isOnline:Boolean = false
) {

    //var introBit:String

    constructor(id:String, firstName:String?, lastName:String?) : this(
        id = id,
        firstName = firstName,
        lastName = lastName,
        avatar = null)

    constructor(id:String) : this(id, "John", "Doe")

    init {
        //introBit = getIntro()

        println("I'm Alive!!!\n" +
                "${if (lastName === "Doe")"His name is $firstName $lastName" else "And his name is $firstName $lastName!!!"}\n")
    }

//    private fun getIntro() = """
//            Matatumba!
//            Matatumba!
//            Matatumba!
//            Matatumba!
//            ${"\n\n\n"}
//            $firstName $lastName
//
//    """.trimIndent()
//
//    fun printMe() = println("""
//        id:         $id
//        firstName:  $firstName
//        lastName:   $lastName
//        avatar:     $avatar
//        rating:     $rating
//        respect:    $respect
//        lastVisit:  $lastVisit
//        isOnline:   $isOnline
//        """.trimIndent())

    companion object Factory{
        private var lastId : Int = -1
        fun makeUser(fullName:String?) : User{
            lastId++

            var parts:List<String>? = fullName?.split(" ")
            var firstName = parts?.getOrNull(0)
            var lastName = parts?.getOrNull(1)

             return User("$lastId",
                firstName = "${if (firstName is String && !firstName.isBlank()) firstName else "John"}",
                lastName = "${if (lastName is String && !lastName.isBlank()) lastName else "Doe"}")
        }
    }

}
