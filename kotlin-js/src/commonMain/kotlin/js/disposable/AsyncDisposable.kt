@file:Suppress(
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
)

package js.disposable

import js.symbol.Symbol
import kotlin.js.definedExternally as definedExternally_
import seskar.js.JsNativeGetter

external interface AsyncDisposable {
    @JsNativeGetter
    operator fun get(
        key: Symbol.asyncDispose,
    ): AsyncDispose = definedExternally_
}
