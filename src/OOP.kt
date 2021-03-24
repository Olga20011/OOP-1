import  javax.swing.AbstractListModel

fun main() {
    var gari=Car("Subaru","Legacy","KDH 500R",0)
    println(gari.start())
    println(gari.registration)
    println(gari.make)
    gari.name()
    gari.hoot()


}
class Car(var make:String,var model:String,var registration:String,var speed:Int){
    fun start(){
        println("Iam starting...vroooom")
    }
    fun accelerate(acceleration: Int):Int{
        speed=speed+acceleration
        return speed
    }
    fun name(){
        println("$make $model")

    }
    fun hoot(){
        println("peeeeeeep")
    }


}
data class Registration(var name:String,var country:String,var age:Int,var reason:String)