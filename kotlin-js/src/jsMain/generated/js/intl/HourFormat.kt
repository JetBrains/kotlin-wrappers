// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package js.intl

import seskar.js.JsValue
import seskar.js.JsVirtual

@JsVirtual
sealed external interface HourFormat {
    companion object {
        @JsValue("numeric")
        val numeric: HourFormat

        @JsValue("2-digit")
        val twoDigit: HourFormat
    }
}
