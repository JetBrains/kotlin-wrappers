package js.temporal

import seskar.js.JsValue

sealed external interface DateUnit<out T : DateUnit<T>> :
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
