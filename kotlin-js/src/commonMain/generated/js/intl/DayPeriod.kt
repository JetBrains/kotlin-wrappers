// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package js.intl

import js.reflect.unsafeCast

sealed external interface DayPeriod {
    companion object
}

inline val DayPeriod.Companion.narrow: DayPeriod
    get() = unsafeCast("narrow")

inline val DayPeriod.Companion.short: DayPeriod
    get() = unsafeCast("short")

inline val DayPeriod.Companion.long: DayPeriod
    get() = unsafeCast("long")
