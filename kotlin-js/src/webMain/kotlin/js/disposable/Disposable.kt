@file:Suppress(
    "EXPECTED_EXTERNAL_DECLARATION",
    "INTERFACE_WITH_SUPERCLASS",
)

package js.disposable

import js.core.Void
import js.hacks.safeCall
import js.internal.InternalApi
import js.symbol.Symbol

expect external interface Disposable :
    JsAny {

    @SubclassOptInRequired(InternalApi::class)
    interface Mixin :
        Disposable
}

// false positive
@Suppress("EXTENSION_SHADOWED_BY_MEMBER")
fun Disposable.`[@@dispose]`(): Void =
    safeCall(Symbol.dispose)
