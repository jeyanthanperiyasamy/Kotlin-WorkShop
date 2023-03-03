import org.junit.Test

class LazyInitTest {

    @Test
    fun test1() {
        val lazyInit = LazyInit()
    }

    @Test
    fun test2() {
        val lazyInit = LazyInit()
        lazyInit.test()
    }
}