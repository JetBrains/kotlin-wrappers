package js.disposable

import kotlinx.coroutines.NonCancellable
import kotlinx.coroutines.withContext
import kotlin.contracts.InvocationKind
import kotlin.contracts.contract

/**
 * Suspend analog of [AutoCloseable]
 */
@PublishedApi
internal fun interface SuspendAutoCloseable {
    suspend fun close()
}

@PublishedApi
internal suspend inline fun <R> SuspendAutoCloseable.use(
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
internal suspend fun SuspendAutoCloseable.closeFinally(
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
