@file:Suppress(
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
)

package js.disposable

import kotlin.js.JsSymbol
import kotlin.js.definedExternally

external interface Disposable {
    @JsSymbol("dispose")
    fun dispose(): Unit = definedExternally
}
