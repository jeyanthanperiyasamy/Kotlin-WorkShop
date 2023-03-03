import org.junit.Test

class InlineDemoTest {

    @Test
    fun someMethod() {
        val inlineDemo = InlineDemo()
        inlineDemo.someMethod {
            println("")
        }
    }
}