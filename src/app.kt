import java.lang.StringBuilder

fun main() {
   /* val text: String = """SALT II was a series of talks between United States
and Soviet negotiators from 1972 to 1979.
It was a continuation of the SALT I talks."""*/

    val string: Any = "String"
    val number: Any = 666

    val sb = StringBuilder()
    sb.append(string).append(" ").append(number)

    var a = 10
    val b = 20

    //replace Java's switch
    when (a) {
        10 -> println("a = 10")
        20 -> println("a = 20")
        else -> println("undefined value")
    }

    when (a) {
        10 -> {
            println("a = 20")
            a *= 2
        }
        20 -> {
            println("a = 60")
            a *= 3
        }
        else -> { println("undefined value")}
    }

    var t = 101

    when (t) {
        50, 60 -> println("a либо 50, либо 60")
        else -> println("undefined value")
    }


    val value = 777

    when (value) {
        in 10..19 -> println("value in the range on 10 to 19")
        in 19..29 -> println("value in the range on 10 to 19")
        in 100..1000 -> println("value in the range on 100 to 1000")
        else -> println("undefined value")
    }


    val sum = 1000
    val rate = when(sum) {
        in 100..999 -> 10
        in 1000..9999 -> 15
        else -> 20
    }

    println(rate)


    for(i in 1..9){
        for(j in 1..9){
            print("${i * j} \t")
        }
        println()
    }

    var i = 10
    while(i > 0){
        println(i*i)
        i--
    }


   /* val c = if (a > b) a else b
    println(c)

    val result = if (a > b) {
    println("a = $a")
        a
    } else {
        println("a = $b")
        b
    }
    println(result)*/

    /*println(sb.toString())*/
}
