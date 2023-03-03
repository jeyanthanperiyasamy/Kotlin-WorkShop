class LazyInit {

    private val person by lazy {
        println("Create Object...")
        Person("andy", "witrisna", 25)
    }

    fun test() {
        person.lastname
    }
}