import kotlin.concurrent.thread

//array de 5 elementos pedir por teclado los 5 numeros e imprimirlos
fun main() {
    var num = IntArray(5) { 0 }
    for (i in num.indices) {
        println("dime el ${i + 1}")
        num[i] = readln().toInt()
    }
    for (x in num.indices) {
            println("el numero para la posicion ${x + 1} es: ${num[x]}...")
            Thread.sleep(1000)
        }
    for (i in 1..100){
        suma=suma + i
        print("Alvaroooooooooooooo titan")
    }
}