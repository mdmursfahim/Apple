package Fruit

class Fruit{
    var name:String= ""
    var color:String = ""
    var size:Int = 0

    constructor(name:String){
        this.name = name
    }

    constructor(name:String, color:String){
        this.name = name
        this.color = color

    }
    constructor(name:String, color:String, size:Int){
        println("name $name, color: $color, size: $size")
    }


//    init{
//        println("Name: $name")
//        println("Color: $color")
//        println("Size: $size")
//    }
}