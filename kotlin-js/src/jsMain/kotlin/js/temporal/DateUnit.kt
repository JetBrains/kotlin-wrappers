@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package js.temporal

import seskar.js.JsValue
import seskar.js.JsVirtual

@JsVirtual
sealed external interface DateUnit<T : DateUnit<T>> :
    DateTimeUnit<T> {
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

    sealed interface year : DateUnit<year>
    sealed interface month : DateUnit<month>
    sealed interface week : DateUnit<week>
    sealed interface day : DateUnit<day>
}
