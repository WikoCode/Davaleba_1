fun main() {
    println("Welcome to CALCULATE X + Y SIMULATOR.")

    do {

        println("insert a value for X :")

        val numberOne = readLine()?.toInt()



        println("Nice number! insert a value for Y now :")

        val numberTwo = readLine()?.toInt()

        println("Alright, the sum of X and Y is: ${numberOne!! + numberTwo!!}")

        println("Would you like to go again?(Type 'Yes' for confirmation) :")

        val answer = readLine()

    } while (answer.equals("Yes", ignoreCase = true))


}


