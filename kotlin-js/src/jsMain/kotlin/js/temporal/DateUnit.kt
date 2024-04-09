@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package js.temporal

import seskar.js.JsValue
import seskar.js.JsVirtual

@JsVirtual
sealed external interface DateUnit :
    DateTimeUnit {
    companion object {
        @JsValue("year")
        val year: DateUnit

        @JsValue("month")
        val month: DateUnit

        @JsValue("week")
        val week: DateUnit

        @JsValue("day")
        val day: DateUnit
    }
}
