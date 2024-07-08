package react.internal

import react.Cleanup
import react.CleanupBuilder

fun createCleanupCallback(
    block: CleanupBuilder.() -> Unit,
): () -> Cleanup? = {
    val cleanups = arrayOf<Cleanup>()
    block(cleanups.unsafeCast<CleanupBuilder>())
    buildCleanup(cleanups)
}
