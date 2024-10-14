import kotlin.random.Random

fun main()
{
    println("9.8")
    val a = Random.nextInt(1, 101) // Случайное число от 1 до 100
    var b: Int
    var c = 0
    println("Я загадал число от 1 до 100.")
    do
    {
        print("Введите ваше число: ")
        b = readLine()?.toIntOrNull() ?: 0
        c++

        if (b < a)
        {
            println("Загаданное число больше.")
        }
        else if (b > a)
        {
            println("Загаданное число меньше.")
        }
    }
    while (b != a)
    println("Вы угадали число $a за $c попыток.")
}