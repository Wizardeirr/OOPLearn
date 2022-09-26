package com.volkankelleci.oop

class CAT :ANIMALS(){
    fun mauvSound(){
        super.catSound()
    }
    override fun newSound(){
        println("kiggghhh")
    }
}