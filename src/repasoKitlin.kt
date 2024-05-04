data class Person (val name: String){
    var age:Int = 0;
}

data class User(val name:String,val age:Int)



fun main(){
    val person1 = Person("John")
    val person2 = Person("John")
    person1.age = 10
    person2.age = 20
    println("person1 == person2:  ${ person1 == person2 }")
    println("person1 with age ${person1.age} : ${person1}")
    println("person2 with age ${person2.age} : ${person2}")

    val jack = User(name= "Jack", age = 1)
    val olderJack = jack.copy(age=2)
    println(" name : ${jack.name},edad:${jack.age}:" +
            "${jack}")
    println(" name : ${olderJack.name},edad:${olderJack.age}:" +
            "${olderJack}")

    val jane = User("Jane", 13)
    val (name,age)=jane
    println("nombre : $name , edad $age ")

    for (color in RGB.entries) println(color.toString())

    println("El primer color es ${RGB.valueOf("RED")}")
    println("El primer color es ${RGB.valueOf("GREEN")}")


    var riversArray = arrayOf("Nile","Amazon","Yangtaze")

    riversArray += "Missisipi"
    println(riversArray.joinToString())
    val simpleArray = arrayOf(1,2,3)
    println(simpleArray.joinToString())

    val nullArray: Array<Int?> = arrayOfNulls(3)
    println(nullArray.joinToString())

}

enum class RGB {RED,GREEN, BLUE}

