fun main(){
    print("Enter a number")
    var n= readLine()?.toInt()!!
    var sumnu=0
    var d=0
    while(n!=0) {
        d = n % 10
        sumnu = sumnu + d
        n = n / 10

    }
    print("sum is $sumnu")

}