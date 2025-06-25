@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package js.temporal

import js.reflect.unsafeCast

sealed external interface TimeUnit<out T : TimeUnit<T>> :
    DateTimeUnit<T> {
    sealed interface hour : TimeUnit<hour>
    sealed interface minute : TimeUnit<minute>
    sealed interface second : TimeUnit<second>
    sealed interface millisecond : TimeUnit<millisecond>
    sealed interface microsecond : TimeUnit<microsecond>
    sealed interface nanosecond : TimeUnit<nanosecond>

    companion object
}

inline val TimeUnit.Companion.hour: TimeUnit.hour
    get() = unsafeCast("hour")

inline val TimeUnit.Companion.minute: TimeUnit.minute
    get() = unsafeCast("minute")

inline val TimeUnit.Companion.second: TimeUnit.second
    get() = unsafeCast("second")

inline val TimeUnit.Companion.millisecond: TimeUnit.millisecond
    get() = unsafeCast("millisecond")

inline val TimeUnit.Companion.microsecond: TimeUnit.microsecond
    get() = unsafeCast("microsecond")

inline val TimeUnit.Companion.nanosecond: TimeUnit.nanosecond
    get() = unsafeCast("nanosecond")
