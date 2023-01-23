fun main()
{
    print("Enter a number")
    val n= readLine()?.toInt()!!
    var result=1
    for (i in 0..n)
    {

        result=n*i
        print("$n * $i=$result\n")
    }

}