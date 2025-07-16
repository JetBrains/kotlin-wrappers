@file:Suppress(
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
)

package js.disposable

import js.symbol.Symbol
import kotlin.js.definedExternally

external interface AsyncDisposable {
    operator fun get(
        key: Symbol.asyncDispose,
    ): AsyncDispose = definedExternally
}
