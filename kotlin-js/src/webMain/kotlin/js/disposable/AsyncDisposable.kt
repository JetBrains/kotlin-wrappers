@file:Suppress(
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
)

package js.disposable

import js.core.Void
import js.promise.PromiseLike
import kotlin.js.JsSymbol
import kotlin.js.definedExternally

external interface AsyncDisposable {
    @JsSymbol("asyncDispose")
    fun asyncDispose(): PromiseLike<Void> = definedExternally
}
