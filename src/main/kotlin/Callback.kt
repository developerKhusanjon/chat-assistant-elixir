import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executors

/**
 * Emulate a delay by blocking the main thread.
 *
 * Warning: Never use this (lol)
 */
fun delay(time: Long) {
    Thread.sleep(time)
}

/**
 * Emulate a delay using threads.
 *
 * Warning: This is really just as an example.
 */
fun delay(time: Long, complete: () -> Unit) {
    val completableFuture = CompletableFuture<String>()
    Executors.newCachedThreadPool().submit<Any?> {
        Thread.sleep(time)
        completableFuture.complete("")
        null
    }
    completableFuture.thenAccept { complete() }
}