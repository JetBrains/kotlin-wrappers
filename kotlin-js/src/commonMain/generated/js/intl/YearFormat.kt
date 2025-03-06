@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package js.intl

import seskar.js.JsValue

sealed external interface YearFormat {
    companion object {
        @JsValue("numeric")
        val numeric: YearFormat

        @JsValue("2-digit")
        val twoDigit: YearFormat
    }
}
