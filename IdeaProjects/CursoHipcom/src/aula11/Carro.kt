package aula11

class Carro(){
    var cor: String? =null
    var velocidadeAtual: Int? =null
    var velocidadeMaxima:Int=150

    fun alterarVelocidade(qtdVelocidade:Int): Unit {
        velocidadeAtual = velocidadeAtual?.plus(qtdVelocidade)

    }
    


}