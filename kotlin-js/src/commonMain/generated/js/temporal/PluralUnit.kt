// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package js.temporal

import seskar.js.JsValue

sealed external interface PluralUnit<T : DateTimeUnit<T>> :
    LargestUnit<T>, SmallestUnit<T>, TotalUnit<T> {
    companion object {
        @JsValue("years")
        val years: PluralUnit<DateUnit.year>

        @JsValue("months")
        val months: PluralUnit<DateUnit.month>

        @JsValue("weeks")
        val weeks: PluralUnit<DateUnit.week>

        @JsValue("days")
        val days: PluralUnit<DateUnit.day>

        @JsValue("hours")
        val hours: PluralUnit<TimeUnit.hour>

        @JsValue("minutes")
        val minutes: PluralUnit<TimeUnit.minute>

        @JsValue("seconds")
        val seconds: PluralUnit<TimeUnit.second>

        @JsValue("milliseconds")
        val milliseconds: PluralUnit<TimeUnit.millisecond>

        @JsValue("microseconds")
        val microseconds: PluralUnit<TimeUnit.microsecond>

        @JsValue("nanoseconds")
        val nanoseconds: PluralUnit<TimeUnit.nanosecond>
    }

}
