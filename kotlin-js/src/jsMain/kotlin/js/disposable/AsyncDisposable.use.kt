@file:Suppress(
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
)

package js.disposable

import js.promise.await
import js.symbol.Symbol
import kotlin.contracts.InvocationKind
import kotlin.contracts.contract

suspend inline fun <T : AsyncDisposable?, R> T.use(block: (T) -> R): R {
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
        this.closeFinally(exception)
    }
}

@PublishedApi
internal suspend fun AsyncDisposable?.closeFinally(cause: Throwable?) = when {
    this == null -> {}
    cause == null -> this[Symbol.asyncDispose]().await()
    else ->
        try {
            this[Symbol.asyncDispose]().await()
        } catch (closeException: Throwable) {
            cause.addSuppressed(closeException)
        }
}
