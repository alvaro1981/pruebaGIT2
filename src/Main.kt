class Rectangle(val height:Double, val lenght:Double){
    val perimeter = (height +lenght) * 2
}

fun maxOf(a: Int, b: Int):Int {
    if(a > b){
        return a
    }else{
        return b
    }
}
fun maxMejorada(a:Int, b: Int) = if (a>b) a else b
fun main() {
    val  rectangle = Rectangle(5.0,2.0)
    println("El perimetro es ${rectangle.perimeter}")
    var a = 1
    val s1 = " a es $a"
    println(s1)

    val s2 = "${s1.replace("es","fue")}, pero ahora es $a"
    println(s2)
    println("max of 0 and 42 is ${maxOf(0,42)}")
    println(" el maximo entre 53 y 52 es ${maxMejorada(53,52)}")
    val items = listOf("melon","manzana", "banana","kiwi", "naranja"
        ,"platano", "mango","maracuya", "ciruela","melvin"
        ,"muerdago","membrillo")

    for(item in items)  println(item)

    for(index in items.indices){
        println("item en $index is ${items[index]}")
    }

    var indice = 0

    while(indice < items.size){
        println("item en $indice es ${items[indice]}")
        indice++
    }
    val x = 11

    val y = 9

    if(x in 1 .. y+1) println("El valor de X = $x , esta en el rango")
    else println("El valor de X = $x , no esta en el rango")

    val list = listOf("a", "b","c")

    if( -1 !in 0..list.lastIndex) println(" Esta fuera  del rango")
    else println("esta dentro del rango")

    if (list.size !in list.indices) {
        println("el tamaño de la lista esta fuera de del rango de indices valido de la lista")
    }
 // iterar en un rango
      for(x in 1..5){
           print(x)
      }
      println("") // solo lo hice para saltar una linea

 // iterar sobre una progresion

    for (x in 1..10 step 2){
        println(x)
    }

    for (x in 9 downTo 0 step 3){
      print("valor x = $x ")
       }


    for(item in items) println(item)

    when{
        "manzana" in items -> println("que rico hay manzana ")
        "naranja" in items -> println("Hay naranja por lo tanto haremos jugo")
        "kiwi" in items -> println("que rico hay kiwi ")
    }

    items
        .filter { it.startsWith("m") }
        .sortedBy { it }
        .map { it.uppercase() }
        .forEach{println(it)}
    printProduct("20", "tres")

    fun printLength(obj: Any){
        println("Getting the length of '$obj'." +
                "Result:${getStringLength (obj)}")
    }
    printLength("Incomprehensibilities")
    printLength(1000)
    printLength(listOf(Any()))

}

fun parseInt(str:String):Int?{
    return str.toIntOrNull()
}

fun printProduct(arg1:String, arg2:String){
    val x = parseInt(arg1)
    val y = parseInt(arg2)

    if(x != null && y != null){
        println(x * y)
    }
    else{
        println("'$arg1' or '$arg2' is not a number")
    }


}

fun getStringLength(obj:Any): Int?{
    if(obj is String){
        return obj.length
    }
    return null
}

