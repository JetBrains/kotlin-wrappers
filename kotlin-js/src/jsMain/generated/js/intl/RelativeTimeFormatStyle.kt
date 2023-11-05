// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package js.intl

import seskar.js.JsUnion
import seskar.js.JsValue

@JsUnion
sealed external interface RelativeTimeFormatStyle {
    companion object {
        @JsValue("long")
        val long: RelativeTimeFormatStyle

        @JsValue("short")
        val short: RelativeTimeFormatStyle

        @JsValue("narrow")
        val narrow: RelativeTimeFormatStyle
    }
}
