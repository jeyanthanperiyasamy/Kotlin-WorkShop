import org.junit.Test

class ScopeFunctionTest {

    @Test
    fun testNull() {
        val scope = ScopeFunction()
        scope.showLet(null)
    }

    @Test
    fun test() {
        val scopeFunction = ScopeFunction()
        scopeFunction.showLet(2)
    }
}

