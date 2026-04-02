package js.disposable

import js.symbol.Symbol
import kotlin.contracts.InvocationKind
import kotlin.contracts.contract

@PublishedApi
internal inline fun <T : Disposable, R> usingSync(
    disposable: T,
    block: T.() -> R,
): R {
    contract {
        callsInPlace(block, InvocationKind.EXACTLY_ONCE)
    }

    val closeable = AutoCloseable {
        disposable[Symbol.dispose]()
    }

    return closeable.use { block(disposable) }
}

inline fun <R> usingSync(
    block: DisposableStack.() -> R,
): R {
    contract {
        callsInPlace(block, InvocationKind.EXACTLY_ONCE)
    }

    return usingSync(DisposableStack(), block)
}
