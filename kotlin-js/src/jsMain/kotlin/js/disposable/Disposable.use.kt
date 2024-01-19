@file:Suppress(
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
)

package js.disposable

import kotlin.contracts.InvocationKind
import kotlin.contracts.contract

inline fun <T : Disposable?, R> T.use(block: (T) -> R): R {
    contract {
        callsInPlace(block, InvocationKind.EXACTLY_ONCE)
    }
    return this?.asClosable().use { block(this) }
}
