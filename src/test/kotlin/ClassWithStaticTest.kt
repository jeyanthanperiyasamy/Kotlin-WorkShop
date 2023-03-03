import org.junit.Assert.*
import org.junit.Test

class ClassWithStaticTest {

    @Test
    fun name() {
        ClassWithStatic.info
        ClassWithStatic.getMoreInfo()
    }
}