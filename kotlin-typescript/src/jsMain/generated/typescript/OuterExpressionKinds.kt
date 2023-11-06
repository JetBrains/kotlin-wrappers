// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package typescript

import seskar.js.JsIntValue
import seskar.js.JsUnion

@JsUnion
sealed external interface OuterExpressionKinds {
    companion object {
        @JsIntValue(1)
        val Parentheses: OuterExpressionKinds

        @JsIntValue(2)
        val TypeAssertions: OuterExpressionKinds

        @JsIntValue(4)
        val NonNullAssertions: OuterExpressionKinds

        @JsIntValue(8)
        val PartiallyEmittedExpressions: OuterExpressionKinds

        @JsIntValue(6)
        val Assertions: OuterExpressionKinds

        @JsIntValue(15)
        val All: OuterExpressionKinds

        @JsIntValue(16)
        val ExcludeJSDocTypeAssertion: OuterExpressionKinds
    }
}
