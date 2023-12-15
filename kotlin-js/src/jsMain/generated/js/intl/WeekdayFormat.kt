// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package js.intl

import seskar.js.JsValue
import seskar.js.JsVirtual

@JsVirtual
sealed external interface WeekdayFormat {
    companion object {
        @JsValue("long")
        val long: WeekdayFormat

        @JsValue("short")
        val short: WeekdayFormat

        @JsValue("narrow")
        val narrow: WeekdayFormat
    }
}
