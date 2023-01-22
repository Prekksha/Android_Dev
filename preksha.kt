//import kotlin.math.sqrt

//fun main(){
// val string=" EEVOL ylno "
//    println("our string:${string.reversed()}")
//}
//fun main(){
//    val string="preksha"
//    var a=(string.reversed())
//    if(string==a)
//        println("Palindrome")
//    else
//        print("Not a palindrome")
//}
//fun main() {
//    println("Enter your age")
//    val age = readLine()?.toInt()
//
//    if (age != null) {
//        if (age >= 0 && age < 18) {
//            println("Not an Adult")
//        } else if (age >=18 && age <= 65) {
//            println("Adult")
//        } else {
//            print("you are very Old")
//        }
//    }
//}
//fun main(){
//
//    println("Enter a number")
//    val num= readLine()?.toInt()
//    var i=0
//    while (i<num) {
//        println("countdown starts to 0")
//        println(i)
//        i++
//    }
//
//}always create new file in main->kotlin 
//fun main()
//{
//println("Where are you from?")
//    val country= readLine()
//    when(country){
//        "India"-> println("Namaste")
//        "USA"-> println("Hello")
//
//    }
//
//}
//fun main()
//{
//    var sum=0
//    for (i in 1..5)
//        sum+=i
//    println("the sum is $sum")
//}
//fun main(){
//    val list= listOf(3,2,5,1,5,6,7)
//    val pos=-1
//    val num= readLine()?.toInt()
//    search(list)
//    println("number found at index $pos")
//    println(sqrt(9.0))
//}

//fun search(list: List<Int>):Int{

//    println("Enter a search number")
//    val num= readLine()?.toInt()
//    if (num!=null) {
//        for (i in list) {
//            if (list[i] == num) {
//                pos = i
//            }
//        }
    //}
fun main()
{
    print("enter the number")
    val num= readLine()?.toInt()
    var sum=0
    var evensum=0
    var oddsum=0
    if(num!=null) {

        for (i in 0..num) {
            if (i % 2 == 0) {
                evensum += i
            }

            else
            {
                oddsum+=i
            }

        }
        print("sum of even numbers is $evensum\n")
        print("the sum of odd numbers is $oddsum")
    }

}