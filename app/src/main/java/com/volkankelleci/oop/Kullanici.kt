package com.volkankelleci.oop

class Kullanici:AllProporitiesClass {

    var isim : String?=null
    var yas : Int?=null

    constructor(isim:String, yas:Int){
        this.isim=isim
        this.yas=yas
        println("YAZDIR")

    }
    init {
        println("another println")
    }

}