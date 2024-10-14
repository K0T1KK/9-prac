fun i(s1: String, s2: String): Boolean
{
    if (s1.length != s2.length)
    {
        return false
    }
    val srt1 = s1.lowercase().toCharArray().sortedArray()
    val srt2 = s2.lowercase().toCharArray().sortedArray()
    return srt1.contentEquals(srt2)
}

fun main()
{
    println("9.4")
    print("Введите первую строку: ")
    val s1 = readLine() ?: ""
    print("Введите вторую строку: ")
    val s2 = readLine() ?: ""

    if (i(s1, s2))
    {
        println("Строки являются анаграммами")
    }
    else
    {
        println("Строки не являются анаграммами")
    }
}