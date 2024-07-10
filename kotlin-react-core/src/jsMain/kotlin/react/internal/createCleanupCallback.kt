package react.internal

import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.launch
import react.Cleanup
import react.CleanupBuilder
import kotlin.coroutines.EmptyCoroutineContext

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
    val job = CoroutineScope(EmptyCoroutineContext)
        .launch(block = block)

    return@callback {
        job.cancel()
    }
}
