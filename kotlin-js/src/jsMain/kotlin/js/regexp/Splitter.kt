@file:Suppress(
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
)

package js.regexp

import js.array.ReadonlyArray
import js.symbol.Symbol
import seskar.js.JsNative

external interface Splitter {
    @JsNative
    operator fun get(
        key: Symbol.split,
    ): Split = definedExternally

    interface Split {
        @JsNative
        fun invoke(
            string: String,
            limit: Int = definedExternally,
        ): ReadonlyArray<String>
    }
}
