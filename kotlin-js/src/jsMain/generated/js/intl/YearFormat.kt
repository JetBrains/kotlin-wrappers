// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package js.intl

import seskar.js.JsValue
import seskar.js.JsVirtual

@JsVirtual
sealed external interface YearFormat {
    companion object {
        @JsValue("numeric")
        val numeric: YearFormat

        @JsValue("2-digit")
        val twoDigit: YearFormat
    }
}
