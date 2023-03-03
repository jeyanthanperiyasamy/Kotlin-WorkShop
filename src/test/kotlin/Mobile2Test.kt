import org.junit.Test

class Mobile2Test {

    @Test
    fun name() {
        val mobile = Mobile2()
        mobile.brand
        mobile.version
        val mobile2 = Mobile2(version = 13)
        val mobile3 = Mobile2("Android")
        val mobile4 = Mobile2("Android", 14)

        mobile.makeCall("12345")
        mobile.makeCall("12345", true)
        mobile.makeCall("12345", withSpeaker = true)
    }
}