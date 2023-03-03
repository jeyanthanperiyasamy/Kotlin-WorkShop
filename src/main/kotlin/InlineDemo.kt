class InlineDemo {

    fun someMethod(function:() -> Unit) { // Add Inline
        function()
    }
}