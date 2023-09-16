fun main (){
    val nr1:Int
    val nr2:Int
    val nr3:Int

    //Eingabe für den Nutzer
    println("Bitte gib nachfolgend 3 Zahlen ein und ich sage dir welche die größte ist")
    println("Nr1")
    nr1 = readln().toInt()
    println("Nr2")
    nr2 = readln().toInt()
    println("Nr3")
    nr3 = readln().toInt()

    // Mit maxOf vergleich zwischen den eingaben machen welche die größte Nr ist
    val biggestNr:Int = maxOf(nr1,nr2,nr3)
    println("Die größte Nummer ist $biggestNr")
}