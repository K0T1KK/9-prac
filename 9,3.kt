fun main()
{
    println("9.3")
    print("Введите сумму в долларах: ")
    val a = readLine()?.toDouble() ?:0.0

    val c = 0.9

    val b = a * c
    println("$a долларов = $b евро")
}