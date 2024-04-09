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
        val year: year

        @JsValue("month")
        val month: month

        @JsValue("week")
        val week: week

        @JsValue("day")
        val day: day
    }

    sealed interface year : DateUnit
    sealed interface month : DateUnit
    sealed interface week : DateUnit
    sealed interface day : DateUnit
}
