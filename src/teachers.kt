
class teacher{
    var name:String= ""
    var id:Int = 0
    var address:String = ""

    constructor(name:String){
        this.name = name
    }

    constructor(name:String, id:Int){
        this.name = name
        this.id = id

    }
    constructor(name:String, id:$id, address: $address"){
    this.name = name
    this.id = id
    this.address = address
}

}
class student{
    var name:String=""
    var id:Int=0
    var address:String=""

    constructor(name:String){
        this.name = name
            }

    constructor(name:String, id:Int){
        this.name = name
        this.id = id

            }
    constructor(name:String, id:$id, address: $address"){
    this.name = name
    this.id = id
    this.address = address
        }
        }