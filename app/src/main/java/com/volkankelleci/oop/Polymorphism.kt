package com.volkankelleci.oop

class Polymorphism {

    fun firstMove(a:Int,b:Int):Int{
        return a+b
    }
    fun firstMove(a:Int,b:Int,c:Int):Int{
        return a+b+c
    }
    fun firstMove(a:Int,b:Int,c: Int,d:Int):Int{
        return a+b+c+d
    }
}