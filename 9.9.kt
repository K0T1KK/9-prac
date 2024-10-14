import kotlin.random.Random

fun j(length: Int): String
{
    println("9.9")
    val a = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%^&*()_+"
    val b = StringBuilder()

    for (i in 1..length)
    {
        val c = Random.nextInt(a.length)
        b.append(a[c])
    }
    return b.toString()
}

fun main()
{
    print("Введите желаемую длину пароля: ")
    val e = readLine()?.toIntOrNull() ?: 0
    val f = j(e)
    println("Сгенерированный пароль: $f")
}