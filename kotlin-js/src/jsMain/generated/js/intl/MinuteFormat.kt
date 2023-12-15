// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package js.intl

import seskar.js.JsValue
import seskar.js.JsVirtual

@JsVirtual
sealed external interface MinuteFormat {
    companion object {
        @JsValue("numeric")
        val numeric: MinuteFormat

        @JsValue("2-digit")
        val twoDigit: MinuteFormat
    }
}
