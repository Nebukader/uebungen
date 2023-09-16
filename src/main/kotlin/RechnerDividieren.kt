fun main(args: Array<String>) {
    var number1:Int
    var number2:Int
    val result:Int

    println("Hi hier kann du jetzt beliebige zahlen dividieren")
    println("Bitte gib jetzt deine erste zahl ein.")
    number1 = readln().toInt()
    println("Bitte gib jetzt deine Zweite Zahl ein.")
    number2 = readln().toInt()

    // Berechnung 1 Nr1 geteilt durch Nr2
    val calculation:Int = number1 / number2

    // Für den Rest wird Modulo genutzt Nr1 Modulo (%) Nr 2
    val calculationModulo:Int = number1 % number2

    println("Ergebnis: $number1 geteilt durch $number2 ist $calculation mit dem Rest $calculationModulo")
}