package Aula12

data class Money(val quantidade: Int, val moeda: String)

fun main(args: Array<String>) {
    val arrayInteiros = arrayOf(0, 1, 2, 3, 4, 5, 6, 7, 8, 9)

    achaNumeroArray(1, arrayInteiros)

    var lista = arrayOf("k","q","f","a","o")
    //var lista:String = "k1q2f3a4o5"
    //println(lista.size)
    lista.forEach { print(it) }

    var ordena:Int

    for (i in 0..lista.size-1){
        println(lista[i].toString())
        //for (j in 0..i+1 )
            //if
    }
/*
    var aux = ""
    // for (i=0; i<aux.size;i++) in java
    for (i in lista.indices)    {
        println(lista[i]+": "+i)
        var teste=lista.size-1
        for (j in lista.indices) {
            if (lista[j]>lista[j+1]){
                aux=lista[j].toString()
                lista[j]=lista[j+1].toString()
                lista[j+1]=aux
            }
        }

    }
*/
/*    //var lista: String = "k1q2f3a4o5"
    val lista = arrayOf("0", "1", "2", "3", "4", "5", "6", "7", "8", "9")
    //for (j in validos) println(j)
    for (i in lista.indices) {
        //for (j in validos)
        //if ( lista[i] = j {
        println(lista[i].toString())
        //}
    }
*/
}

fun achaNumeroArray(numero: Int, array: Array<Int>) = array.forEach {
    if (it.equals(numero)) println("o número $numero existe no array")
}

