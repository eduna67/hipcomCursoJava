fun main(args: Array<String>) {
    println("Criando objeto carro.")
    var carro = Carro()
    carro.modelo = "Fusca"
    carro.cor = "vermelho"
    carro.printCor()

    carro.velocidadeAtual = 50
    carro.printVelocidadeAtula()
    carro.acelera(150)
    carro.printVelocidadeAtula()
    carro.freia(10)
    carro.printVelocidadeAtula()

    carro.acelera(100)

    var carros = ArrayList<Carro>()
    carros.add(carro)
    carros.add(Carro(modelo = "Palio", cor = "Amarelo", velocidadeMaxima = 100, velocidadeAtual = 50))
    carros.forEach {  }


    for (carromostra in carros) {
        println("O carro ${carromostra.modelo} é da cor: ${carromostra.cor}")
    }
}

class Carro(var cor:String ="",var velocidadeMaxima:Int=150,var velocidadeAtual: Int =0,var modelo:String=""){
    fun printCor(){println("A cor é: "+cor)}
    fun printVelocidadeAtula(){println("A velocidade atual é: "+velocidadeAtual)}
    fun acelera(velocidade:Int){
        if (velocidadeAtual + velocidade>velocidadeMaxima){
            println("Velocidade máxima acima do permitido: " + (velocidadeAtual+velocidade))
            velocidadeAtual=velocidadeMaxima
        } else velocidadeAtual +=velocidade
    }
    fun freia(velocidade:Int){
        if (velocidadeAtual - velocidade<0){
            println("O carro parou!")
            velocidadeAtual=0
        } else velocidadeAtual -=velocidade
    }
}