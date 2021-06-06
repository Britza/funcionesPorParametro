import kotlin.random.Random
import kotlin.random.nextInt

fun  main(args: Array<String>) {

    for(num in Ejercicio1(10).tabla7)
        println(num)


    val tabla7 = Ejercicio2(10){ Random.nextInt(50..250)}
    tabla7.tabla7.forEach { println(it)  }
}
