@file:Suppress(
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
)

package js.regexp

import js.symbol.Symbol
import seskar.js.JsNative

external interface Replacer {
    @JsNative
    operator fun get(
        key: Symbol.replace,
    ): Replace = definedExternally

    interface Replace {
        @JsNative
        fun invoke(
            string: String,
            replaceValue: String,
        ): Int

        @JsNative
        fun invoke(
            string: String,
            replacer: (substring: String) -> String,
        ): Int
    }
}
