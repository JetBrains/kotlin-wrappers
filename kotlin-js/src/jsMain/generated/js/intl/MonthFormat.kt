// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package js.intl

import seskar.js.JsValue
import seskar.js.JsVirtual

@JsVirtual
sealed external interface MonthFormat {
    companion object {
        @JsValue("numeric")
        val numeric: MonthFormat

        @JsValue("2-digit")
        val twoDigit: MonthFormat

        @JsValue("long")
        val long: MonthFormat

        @JsValue("short")
        val short: MonthFormat

        @JsValue("narrow")
        val narrow: MonthFormat
    }
}
