@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package js.temporal

import js.reflect.unsafeCast

/**
 * When the name of a unit is provided to a Temporal API as a string, it is
 * usually singular, e.g. 'day' or 'hour'. But plural unit names like 'days'
 * or 'hours' are aso accepted too.
 */
sealed external interface PluralUnit<T : DateTimeUnit<T>> :
    LargestUnit<T>,
    SmallestUnit<T>,
    TotalUnit<T> {
    companion object
}

inline val PluralUnit.Companion.years: PluralUnit<DateUnit.year>
    get() = unsafeCast("years")

inline val PluralUnit.Companion.months: PluralUnit<DateUnit.month>
    get() = unsafeCast("months")

inline val PluralUnit.Companion.weeks: PluralUnit<DateUnit.week>
    get() = unsafeCast("weeks")

inline val PluralUnit.Companion.days: PluralUnit<DateUnit.day>
    get() = unsafeCast("days")

inline val PluralUnit.Companion.hours: PluralUnit<TimeUnit.hour>
    get() = unsafeCast("hours")

inline val PluralUnit.Companion.minutes: PluralUnit<TimeUnit.minute>
    get() = unsafeCast("minutes")

inline val PluralUnit.Companion.seconds: PluralUnit<TimeUnit.second>
    get() = unsafeCast("seconds")

inline val PluralUnit.Companion.milliseconds: PluralUnit<TimeUnit.millisecond>
    get() = unsafeCast("milliseconds")

inline val PluralUnit.Companion.microseconds: PluralUnit<TimeUnit.microsecond>
    get() = unsafeCast("microseconds")

inline val PluralUnit.Companion.nanoseconds: PluralUnit<TimeUnit.nanosecond>
    get() = unsafeCast("nanoseconds")
