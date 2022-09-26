package com.volkankelleci.oop

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        println("Sınıflar")
        Kullanici("username",44)

        println("**ENCAPSULATION**")

        val user=GetterClass("Volkan",26,"Shop Personal")
        println(user.name)


        println("**INHERITANCE**")

        val user2=SuperGetterClass("MAN",26,"SELLER")
        println(user2.age)

        user2.showToName()

        println("Static Polymorphism")

        val newMove=Polymorphism()

        println(newMove.firstMove(20,30))
        println(newMove.firstMove(30,50,90))
        println(newMove.firstMove(1,2,3,4))

        println("**Dynamic Polymorphism**")
        val catValue=CAT()
        catValue.mauvSound()
        catValue.newSound()

        val catAnotherValue=ANIMALS()
        catAnotherValue.newSound()
        catAnotherValue.catSound()

        println("**Abstract Class**")

        val userInfos=Kullanici("Volkan",26)
        userInfos.userAttribiutes()



    }
}