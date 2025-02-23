@file:Suppress(
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
)

package js.regexp

import js.symbol.Symbol
import seskar.js.JsNative

external interface Matcher {
    @JsNative
    operator fun get(
        key: Symbol.match,
    ): Match = definedExternally

    interface Match {
        @JsNative
        fun invoke(
            string: String,
        ): RegExpMatchArray?
    }
}
