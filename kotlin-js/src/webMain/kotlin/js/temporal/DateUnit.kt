package js.temporal

import js.reflect.unsafeCast
import js.union.JsUnion

@JsUnion
sealed /* union */
external interface DateUnit<out T : DateUnit<T>> :
    DateTimeUnit<T> {
    sealed interface year : DateUnit<year>
    sealed interface month : DateUnit<month>
    sealed interface week : DateUnit<week>
    sealed interface day : DateUnit<day>
}

inline val DateUnit.Companion.year: DateUnit.year
    get() = unsafeCast("year")

inline val DateUnit.Companion.month: DateUnit.month
    get() = unsafeCast("month")

inline val DateUnit.Companion.week: DateUnit.week
    get() = unsafeCast("week")

inline val DateUnit.Companion.day: DateUnit.day
    get() = unsafeCast("day")
