// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.cssom

import seskar.js.JsUnion
import seskar.js.JsValue

@JsUnion
sealed external interface CSSMathOperator {
    companion object {
        @JsValue("clamp")
        val clamp: CSSMathOperator

        @JsValue("invert")
        val invert: CSSMathOperator

        @JsValue("max")
        val max: CSSMathOperator

        @JsValue("min")
        val min: CSSMathOperator

        @JsValue("negate")
        val negate: CSSMathOperator

        @JsValue("product")
        val product: CSSMathOperator

        @JsValue("sum")
        val sum: CSSMathOperator
    }
}
