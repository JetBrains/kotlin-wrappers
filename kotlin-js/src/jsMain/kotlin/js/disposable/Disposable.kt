@file:Suppress(
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
)

package js.disposable

import js.symbol.Symbol
import seskar.js.JsNative

external interface Disposable {
    @JsNative
    operator fun get(
        key: Symbol.dispose,
    ): () -> Unit = definedExternally
}
