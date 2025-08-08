package react.internal

import js.internal.InternalApi
import js.reflect.unsafeCast
import react.Cleanup
import react.CleanupBuilder

@InternalApi
fun buildCleanupCallback(
    block: CleanupBuilder.() -> Unit,
): () -> Cleanup? = {
    val cleanups = arrayOf<Cleanup>()
    block(unsafeCast(cleanups))
    buildCleanup(cleanups)
}
