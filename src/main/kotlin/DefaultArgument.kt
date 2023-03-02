fun displayBorder(character: Char = '=', length: Int = 15) {
    for (i in 1..length) {
        print("$character")
    }
    print("\n")
}


class Mobile constructor(private var brand: String, private val model: String = "14", private val osVersion: String = "16") {
    // init function

    init {
        println("In init")
        this.brand = brand.uppercase()
    }

    constructor(osVersion: String) : this(brand = "iphone", osVersion = osVersion) {

    }


    fun printDetails(){
        println("Mobile details:")
        println("Brand: $brand")
        println("Model: $model")
        println("Model: $osVersion")
    }
}

fun main(args: Array<String>) {

    displayBorder()

    displayBorder('*')

    displayBorder('*', 5)

    val mobile = Mobile( "20")
    mobile.printDetails()

}



