package js.disposable

import js.disposable.internal.AsyncCloseableDisposable
import js.disposable.internal.close
import kotlin.contracts.InvocationKind
import kotlin.contracts.contract

suspend inline fun <T : AsyncCloseableDisposable, R> T.use(
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
