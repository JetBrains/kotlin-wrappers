@file:Suppress(
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
)

package js.regexp

import js.symbol.Symbol
import seskar.js.JsNative

external interface Searcher {
    @JsNative
    operator fun get(
        key: Symbol.search,
    ): Search = definedExternally

    interface Search {
        @JsNative
        fun invoke(string: String): Int
    }
}
