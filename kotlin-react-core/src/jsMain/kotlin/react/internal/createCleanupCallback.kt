package react.internal

import kotlinx.coroutines.CoroutineScope
import react.Cleanup
import react.CleanupBuilder

fun createCleanupCallback(
    block: CleanupBuilder.() -> Unit,
): () -> Cleanup? = {
    val cleanups = arrayOf<Cleanup>()
    block(cleanups.unsafeCast<CleanupBuilder>())
    buildCleanup(cleanups)
}

fun createCleanupCallback(
    block: suspend CoroutineScope.() -> Unit,
): () -> Cleanup? = callback@{
    val job = launchIsolatedJob(block)

    return@callback {
        job.cancel()
    }
}
