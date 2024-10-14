fun i(number: Int): Boolean
{
    if (number <= 1)
    {
        return false
    }
    for (i in 2..Math.sqrt(number.toDouble()).toInt())
    {
        if (number % i == 0)
        {
            return false
        }
    }
    return true
}

fun main()
{
    println("9.5")
    print("Введите число N: ")
    val n = readLine()?.toInt() ?: 0
    println("Простые числа до $n:")
    for (j in 2..n)
    {
        if (i(j))
        {
            print("$j ")
        }
    }
}