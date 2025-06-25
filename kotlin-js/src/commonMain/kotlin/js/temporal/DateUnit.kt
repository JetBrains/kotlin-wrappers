@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package js.temporal

import js.reflect.unsafeCast

sealed external interface DateUnit<out T : DateUnit<T>> :
    DateTimeUnit<T> {
    sealed interface year : DateUnit<year>
    sealed interface month : DateUnit<month>
    sealed interface week : DateUnit<week>
    sealed interface day : DateUnit<day>

    companion object
}

inline val DateUnit.Companion.year: DateUnit.year
    get() = unsafeCast("year")

inline val DateUnit.Companion.month: DateUnit.month
    get() = unsafeCast("month")

inline val DateUnit.Companion.week: DateUnit.week
    get() = unsafeCast("week")

inline val DateUnit.Companion.day: DateUnit.day
    get() = unsafeCast("day")
