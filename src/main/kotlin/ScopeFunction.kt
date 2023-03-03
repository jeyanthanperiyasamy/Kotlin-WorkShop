class ScopeFunction {

    fun showLet(number: Int?) {
        //val number1 = number + 1
        //val number2 = number!! + 1 //assert number is not null, throw exception
        val result = number?.let {
            it + 1 //let return the last line
        }
        println("LET Result = $result")
   }

    fun showAlso(number: Int?) {
        val result = number?.also {
            it + 1
        }
        println("ALSO Result = $result")
    }

    fun showApply() {
        val scope = ScopeFunction().apply {
            showLet(10)
        }
    }

    fun showRun() {
        val scope3 = ScopeFunction().run {
            showLet(10)
            "return this line"
        }

        val scope2 = with(ScopeFunction()) { //same as run
            showLet(10)
            "return this line"
        }
    }

}