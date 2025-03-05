@file:Suppress(
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
)

package js.disposable

import js.symbol.Symbol
import kotlin.js.definedExternally
import seskar.js.JsNativeGetter

external interface Disposable {
    @JsNativeGetter
    operator fun get(
        key: Symbol.dispose,
    ): Dispose = definedExternally
}
