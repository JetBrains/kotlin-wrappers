@file:Suppress(
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
)

package js.disposable

import js.symbol.Symbol
import seskar.js.JsNativeGetter

external interface AsyncDisposable {
    @JsNativeGetter
    operator fun get(
        key: Symbol.asyncDispose,
    ): AsyncDispose = definedExternally
}
