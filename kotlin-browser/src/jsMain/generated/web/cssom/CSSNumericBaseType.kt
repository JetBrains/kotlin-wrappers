// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.cssom

import seskar.js.JsUnion
import seskar.js.JsValue

@JsUnion
sealed external interface CSSNumericBaseType {
    companion object {
        @JsValue("angle")
        val angle: CSSNumericBaseType

        @JsValue("flex")
        val flex: CSSNumericBaseType

        @JsValue("frequency")
        val frequency: CSSNumericBaseType

        @JsValue("length")
        val length: CSSNumericBaseType

        @JsValue("percent")
        val percent: CSSNumericBaseType

        @JsValue("resolution")
        val resolution: CSSNumericBaseType

        @JsValue("time")
        val time: CSSNumericBaseType
    }
}
