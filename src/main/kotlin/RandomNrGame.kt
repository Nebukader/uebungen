fun main(args: Array<String>) {

    println("Hi verrate mir doch erst mal wie du heißt ?")
    val name = readln().toString()
    println("Willkommen im Zahlengenerator, hier kannst du $name eine Zahl zwischen 1-100 erraten.")
    val rnds = (0..100).random()
    println ("Errate nun welche Zahl es sein könnte zwischen 1-100")
    val userNumber:Int = readln().toInt()
    val result = rnds.toString() .contentEquals(rnds.toString())
    if (result) {
        println("Leider ist deine Antwort Falsch :/")
    } else {
        println("Deine Zahl Nr $userNumber war richtig. Du solltest Hellseher werden :) ")
    }
//  println("Deine geratene Nummer ist $userNumber und die von mir Mr. Mastermind $rnds")
}



