package js.disposable

import js.disposable.internal.SuspendCloseable
import js.disposable.internal.use
import js.promise.await
import js.symbol.Symbol
import kotlin.contracts.InvocationKind
import kotlin.contracts.contract

suspend inline fun <R> using(
    block: AsyncDisposableStack.() -> R,
): R {
    contract {
        callsInPlace(block, InvocationKind.EXACTLY_ONCE)
    }

    val stack = AsyncDisposableStack()
    val closeable = SuspendCloseable {
        stack[Symbol.asyncDispose]().await()
    }

    return closeable.use {
        block(stack)
    }
}
