fun main()
{
    println("9.2")
    print("Введите строку: ")
    val t = readLine() ?: ""

    var a = 0
    var b = 0

    for (char in t.lowercase())
    {
        if (char in "аяюуеыэои")
        {
            a++
        } else if (char.isLetter())
        {
            b++
        }
    }

    println("Гласных: $a")
    println("Согласных: $b")
}