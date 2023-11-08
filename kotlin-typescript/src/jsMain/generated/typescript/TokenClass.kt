// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package typescript

import seskar.js.JsIntValue
import seskar.js.JsVirtual

@JsVirtual
sealed external interface TokenClass {
    companion object {
        @JsIntValue(0)
        val Punctuation: TokenClass

        @JsIntValue(1)
        val Keyword: TokenClass

        @JsIntValue(2)
        val Operator: TokenClass

        @JsIntValue(3)
        val Comment: TokenClass

        @JsIntValue(4)
        val Whitespace: TokenClass

        @JsIntValue(5)
        val Identifier: TokenClass

        @JsIntValue(6)
        val NumberLiteral: TokenClass

        @JsIntValue(7)
        val BigIntLiteral: TokenClass

        @JsIntValue(8)
        val StringLiteral: TokenClass

        @JsIntValue(9)
        val RegExpLiteral: TokenClass
    }
}
