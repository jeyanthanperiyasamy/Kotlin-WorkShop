// This is Equivalent to static class

class Companion {
    companion object {
        val info = "This is info"
        fun getMoreInfo():String { return "This is more fun" }
    }
}
fun main(args: Array<String>) {

    println(Companion.info)
    println(Companion.getMoreInfo())

}


// singleTon class


