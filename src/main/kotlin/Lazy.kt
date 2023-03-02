//The lateinit keyword stands for “late initialization.”
// When used with a class property, the lateinit modifier keeps the property from being initialized at the time of its class’ object construction.


class RandomFruits {
    var fruit1: String = "tomato"
        private set
    var fruit2: String? = null
        private set

    lateinit var fruit3: String

    fun setFruits() {
        fruit1 = "apple"
        fruit2 = "banana"
        fruit3 = "orange"
    }

    fun print() {
        println(fruit1)

        fruit2?.let {
            println(it)
        }

        if(::fruit3.isInitialized) {
            println(fruit3)
        }
    }
}


fun main() {
   RandomFruits().also {
       it.setFruits()
       it.print()
   }
}

