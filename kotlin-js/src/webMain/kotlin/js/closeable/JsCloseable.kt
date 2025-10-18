package js.closeable

import kotlin.contracts.InvocationKind
import kotlin.contracts.contract

external interface JsCloseable {
    fun close()
}

inline fun <T : JsCloseable, R> T.use(
    block: (T) -> R,
): R {
    contract {
        callsInPlace(block, InvocationKind.EXACTLY_ONCE)
    }

    val closeable = AutoCloseable(::close)

    return closeable.use {
        block(this)
    }
}

