import kotlinx.coroutines.runBlocking
import org.junit.Assert.*

import org.junit.Test

class CoroutineDemoTest {

    @Test
    fun start() = runBlocking {
        val coroutineDemo = CoroutineDemo()
        coroutineDemo.start()
    }

    @Test
    fun test(): Unit = runBlocking {
        val coroutineDemo = CoroutineDemo()
        val response = coroutineDemo.networkCall()
        println(response)
    }
}