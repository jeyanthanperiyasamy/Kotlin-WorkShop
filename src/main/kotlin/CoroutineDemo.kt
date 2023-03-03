import kotlinx.coroutines.*

class CoroutineDemo {

    suspend fun start() {
        val job = GlobalScope.launch(Dispatchers.Default) {
            println("Coroutine thread ${Thread.currentThread().name}")
        }
        val job2 = GlobalScope.launch(Dispatchers.IO) {
            println("Coroutine thread ${Thread.currentThread().name}")
            /*
            withContext(Dispatchers.Main) {
                //Update UI
            }
             */
        }
        val job3 = GlobalScope.launch(newSingleThreadContext("MyThread")) {
            println("Coroutine thread ${Thread.currentThread().name}")
        }
        println("Thread ${Thread.currentThread().name}")
        job.join()
        job2.join()
        job3.join()
    }

    suspend fun networkCall(): String {
        delay(3000)
        return "This is the response"
    }


}