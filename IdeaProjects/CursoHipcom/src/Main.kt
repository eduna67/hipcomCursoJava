import aula11.Carro

fun main(args: Array<String>) {
    println("Olá Mundo")

    var carro= Carro()
    carro.cor="vermelho"
    carro.velocidadeAtual=125
    println("A cor do carro é: "+carro.cor)
    carro.alterarVelocidade(-10)
    println("A velocidade do carro é: "+carro.velocidadeAtual)


}