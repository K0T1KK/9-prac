fun i(text: String): String
{
    val a = text.split("[\\s.,?!;:]+".toRegex())
    var b = a[0]

    for (word in a)
    {
        if (word.length > b.length)
        {
           b = word
        }
    }
    return b
}

fun main()
{
    println("9.10")
    print("Введите строку: ")
    val c = readLine() ?: ""

    val d = i(c)
    println("Самое длинное слово: $d")
}