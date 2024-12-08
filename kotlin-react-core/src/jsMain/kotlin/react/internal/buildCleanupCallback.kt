package react.internal

import js.reflect.unsafeCast
import react.Cleanup
import react.CleanupBuilder

fun buildCleanupCallback(
    block: CleanupBuilder.() -> Unit,
): () -> Cleanup? = {
    val cleanups = arrayOf<Cleanup>()
    block(unsafeCast(cleanups))
    buildCleanup(cleanups)
}
