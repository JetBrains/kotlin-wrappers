package js.disposable

import kotlin.contracts.InvocationKind
import kotlin.contracts.contract

/**
 * Suspend analog of [AutoCloseable]
 */
fun interface SuspendAutoCloseable {
    suspend fun close()
}

suspend inline fun <T : SuspendAutoCloseable, R> T.use(
    block: (T) -> R,
): R {
    contract {
        callsInPlace(block, InvocationKind.EXACTLY_ONCE)
    }

    var exception: Throwable? = null
    try {
        return block(this)
    } catch (e: Throwable) {
        exception = e
        throw e
    } finally {
        closeFinally(exception)
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
