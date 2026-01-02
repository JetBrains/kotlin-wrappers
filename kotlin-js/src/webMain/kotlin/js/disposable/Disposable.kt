@file:Suppress(
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
)

package js.disposable

import js.symbol.Symbol
import kotlin.js.definedExternally

external interface Disposable {
    operator fun get(
        key: Symbol.dispose,
    ): () -> Unit = definedExternally
}
