fun main(){
    val arr= arrayOf(2,3,4,5,6)
    var max=0
    for (i in arr)
    {
        if(i>max)
            max=i

    }
    print("the largest of array elements is $max")
}