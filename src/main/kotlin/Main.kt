import java.text.DecimalFormat
import kotlin.math.roundToInt
import kotlin.math.roundToLong

fun main(args: Array<String>) {
        println("Hi wie lautet dein Name ?")
    var name = readln()
        println("Hi $name hier kannst du deinen BMI berechnen")
        println("$name gibt deine Größe hier in Metern ein.")
    val height =readln().toDouble()
        println("Bitte gibt hier jetzt dein gewicht in KG ein.")
    val weight = readln().toDouble()
    var bmi= weight / (height * height)
    var bmiRound = bmi
    val decimalFormat = DecimalFormat("#.##")
        println("Dein BMI beträgt ${decimalFormat.format(bmi)}")


}