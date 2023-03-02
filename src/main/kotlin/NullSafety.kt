fun main(args: Array<String>){
    // variable is declared as non-nullable
    val s1 : String = "Geeks"

    //s1 = null  // gives compiler error

    println("The length of string s1 is: "+s1.length)


    // variable is declared as nullable
    var s2: String? = "GeeksforGeeks"

    s2 = null    // no compiler error

    println("${s2}")  // compiler error because string can be null

}