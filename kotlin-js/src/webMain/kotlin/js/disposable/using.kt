package js.disposable

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
    val closeable = SuspendAutoCloseable {
        stack[Symbol.asyncDispose]().await()
    }

    return closeable.use {
        block(stack)
    }
}
