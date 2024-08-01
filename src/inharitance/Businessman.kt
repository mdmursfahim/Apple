package inharitance

import person

class Businessman(name:String, age:Int, gender:String, var businessID: String):person(name,age,gender) {

    fun display(){
        println("name:$name")
        println("age:$age")
        println("gender:$gender")
        println("businessID:$businessID")
    }
}

