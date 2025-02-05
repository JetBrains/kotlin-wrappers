@file:Suppress(
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
)

package js.disposable

import kotlin.contracts.InvocationKind
import kotlin.contracts.contract

@PublishedApi
internal inline fun <T : Disposable, R> using(disposable: T, block: (T) -> R): R {
    contract {
        callsInPlace(block, InvocationKind.EXACTLY_ONCE)
    }
    return disposable.asClosable().use { block(disposable) }
}

inline fun <R> usingSync(block: DisposableStack.() -> R): R {
    contract {
        callsInPlace(block, InvocationKind.EXACTLY_ONCE)
    }
    return using(DisposableStack()) { it.block() }
}
