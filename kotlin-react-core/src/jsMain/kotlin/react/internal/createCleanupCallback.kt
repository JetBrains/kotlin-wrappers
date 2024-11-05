package react.internal

import js.reflect.unsafeCast
import kotlinx.coroutines.CoroutineScope
import react.Cleanup
import react.CleanupBuilder

fun createCleanupCallback(
    block: CleanupBuilder.() -> Unit,
): () -> Cleanup? = {
    val cleanups = arrayOf<Cleanup>()
    block(unsafeCast(cleanups))
    buildCleanup(cleanups)
}

fun createCleanupCallback(
    block: suspend CoroutineScope.() -> Unit,
): () -> Cleanup? = callback@{
    val job = isolatedJob(block)

    return@callback {
        job.cancel()
    }
}
