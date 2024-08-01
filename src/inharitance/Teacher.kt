package inharitance

import person

class Teacher(name:String, age:Int, gender:String var subject:String): person(name,age,gender) {

    fun display(){
        println("name:$name")
        println("age:$age")
        println("gender:$gender")
        println("subject:$subject")

    }

}