fun main() {
    print("How many lines of stars you want?")
    val num = readLine()?.toInt()!!
    for (i in 1..num) {
        for (j in 1..i){
            print("*")

    }
    println("")
}
}