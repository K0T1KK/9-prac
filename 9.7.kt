fun main()
{
    println("9.7")
    print("Введите строку: ")
    val a = readLine() ?: ""
    val b = a.toUpperCase()
    println("Строка с другим регистром: $b")
}