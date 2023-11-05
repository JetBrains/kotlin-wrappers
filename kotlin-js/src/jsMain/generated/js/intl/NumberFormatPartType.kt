// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package js.intl

import seskar.js.JsUnion
import seskar.js.JsValue

@JsUnion
sealed external interface NumberFormatPartType {
    companion object {
        @JsValue("literal")
        val literal: NumberFormatPartType

        @JsValue("nan")
        val nan: NumberFormatPartType

        @JsValue("infinity")
        val infinity: NumberFormatPartType

        @JsValue("percent")
        val percent: NumberFormatPartType

        @JsValue("integer")
        val integer: NumberFormatPartType

        @JsValue("group")
        val group: NumberFormatPartType

        @JsValue("decimal")
        val decimal: NumberFormatPartType

        @JsValue("fraction")
        val fraction: NumberFormatPartType

        @JsValue("plusSign")
        val plusSign: NumberFormatPartType

        @JsValue("minusSign")
        val minusSign: NumberFormatPartType

        @JsValue("percentSign")
        val percentSign: NumberFormatPartType

        @JsValue("currency")
        val currency: NumberFormatPartType

        @JsValue("code")
        val code: NumberFormatPartType

        @JsValue("symbol")
        val symbol: NumberFormatPartType

        @JsValue("name")
        val name: NumberFormatPartType

        @JsValue("compact")
        val compact: NumberFormatPartType

        @JsValue("exponentInteger")
        val exponentInteger: NumberFormatPartType

        @JsValue("exponentMinusSign")
        val exponentMinusSign: NumberFormatPartType

        @JsValue("exponentSeparator")
        val exponentSeparator: NumberFormatPartType

        @JsValue("unit")
        val unit: NumberFormatPartType

        @JsValue("unknown")
        val unknown: NumberFormatPartType
    }
}
