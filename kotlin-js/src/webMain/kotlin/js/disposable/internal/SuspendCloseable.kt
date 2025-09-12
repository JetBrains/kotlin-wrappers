package js.disposable.internal

import kotlinx.coroutines.NonCancellable
import kotlinx.coroutines.withContext
import kotlin.contracts.InvocationKind
import kotlin.contracts.contract

/**
 * Suspend analog of [AutoCloseable]
 */
// WA for Kotlin `2.2.20`
// Should be internal
// @PublishedApi
fun interface SuspendCloseable {
    suspend fun close()
}

@PublishedApi
internal suspend inline fun <R> SuspendCloseable.use(
    block: () -> R,
): R {
    contract {
        callsInPlace(block, InvocationKind.EXACTLY_ONCE)
    }

    var exception: Throwable? = null
    try {
        return block()
    } catch (e: Throwable) {
        exception = e
        throw e
    } finally {
        withContext(NonCancellable) {
            closeFinally(exception)
        }
    }
}

@PublishedApi
internal suspend fun SuspendCloseable.closeFinally(
    cause: Throwable?,
) {
    when {
        cause == null -> close()
        else ->
            try {
                close()
            } catch (closeException: Throwable) {
                cause.addSuppressed(closeException)
            }
    }
}
