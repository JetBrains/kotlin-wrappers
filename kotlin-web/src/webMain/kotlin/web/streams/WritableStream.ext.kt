package web.streams

import js.disposable.SuspendAutoCloseable
import js.disposable.use
import kotlin.contracts.InvocationKind
import kotlin.contracts.contract

suspend inline fun <T : WritableStream<*>, R> T.use(
    block: (T) -> R,
): R {
    contract {
        callsInPlace(block, InvocationKind.EXACTLY_ONCE)
    }

    val closeable = SuspendAutoCloseable {
        close()
    }

    return closeable.use {
        block(this)
    }
}
