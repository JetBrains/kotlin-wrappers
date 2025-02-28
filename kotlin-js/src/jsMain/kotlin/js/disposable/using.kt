package js.disposable

import js.symbol.Symbol
import kotlin.contracts.InvocationKind
import kotlin.contracts.contract

@PublishedApi
internal suspend inline fun <T : AsyncDisposable, R> using(
    disposable: T,
    block: (T) -> R,
): R {
    contract {
        callsInPlace(block, InvocationKind.EXACTLY_ONCE)
    }

    var exception: Throwable? = null
    try {
        return block(disposable)
    } catch (e: Throwable) {
        exception = e
        throw e
    } finally {
        disposable.closeFinally(exception)
    }
}

@PublishedApi
internal suspend fun AsyncDisposable.closeFinally(
    cause: Throwable?,
) {
    when {
        cause == null -> this[Symbol.asyncDispose]().await()
        else ->
            try {
                this[Symbol.asyncDispose]().await()
            } catch (closeException: Throwable) {
                cause.addSuppressed(closeException)
            }
    }
}

suspend inline fun <R> using(
    block: AsyncDisposableStack.() -> R,
): R {
    contract {
        callsInPlace(block, InvocationKind.EXACTLY_ONCE)
    }

    return using(AsyncDisposableStack()) { it.block() }
}
