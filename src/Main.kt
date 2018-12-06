fun main(args: Array<String>) {
    println("Criando objeto carro.")
    var carro = Carro()
    carro.cor="vermelho"
    carro.printCor()

    carro.velocidadeAtual=50
    carro.printVelocidadeAtula()
    carro.acelera(150)
    carro.printVelocidadeAtula()
    carro.freia(10)
    carro.printVelocidadeAtula()
}

class Carro(var cor:String ="",var velocidadeMaxima:Int=150,var velocidadeAtual: Int =0){
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