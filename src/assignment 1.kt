fun main() {
    var olga = Human("Esther", 20, 68)
    olga.eat(2)
    olga.speak("I am a coder")
    olga.birthday()


    var esther = User("Akello", "Vivian", "vivian@gmail.com", "0775467893", 4444)
    println("Akello")
    println("vivian@gmail.com")
}
class Human(var name:String,var age:Int,var weight:Int){
    fun eat(foodWeight:Int){
        println("I am eating $foodWeight kgs of food")
        weight=foodWeight+weight
        println(weight)
    }
    fun speak(speech:String){
        println(speech)
    }
    fun birthday(){
        println(age+1)

    }
}
data class User(var firstName:String,var lastName:String,var email:String,var phoneNUmber:String,var password:Int)

