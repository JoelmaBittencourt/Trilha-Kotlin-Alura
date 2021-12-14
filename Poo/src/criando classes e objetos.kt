fun main() {
    println("Bem vindx ao Bytebank")
    //  Conta()//reservar espaços para preenchee depois
    val contaJo = Conta()
    contaJo.titular = "joelma Dev Deusa rica"
    contaJo.numero = 1000
    contaJo.saldo = 500.00

    val contaDi = Conta()
    contaDi.titular = "Diego pobre"
    contaDi.numero = 1001
    contaDi.saldo = 120.00

    println(contaJo.titular)
    println("numero da sua conta")
    println(contaJo.numero)
    println("seu saldo é")
    println(contaJo.saldo)

    println(contaDi.titular)
    println("numero da sua conta")
    println(contaDi.numero)
    println("seu saldo é")
    println(contaDi.saldo)


}

class Conta { //Tudo o que tiver dentro das chaves sao membros da classe
    var titular = ""
    var numero = 0
    var saldo = 0.0

}
