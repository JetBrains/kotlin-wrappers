@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package js.temporal

import seskar.js.JsValue
import seskar.js.JsVirtual

@JsVirtual
sealed external interface TimeUnit<T : TimeUnit<T>> :
    DateTimeUnit<T> {
    companion object {
        @JsValue("hour")
        val hour: hour

        @JsValue("minute")
        val minute: minute

        @JsValue("second")
        val second: second

        @JsValue("millisecond")
        val millisecond: millisecond

        @JsValue("microsecond")
        val microsecond: microsecond

        @JsValue("nanosecond")
        val nanosecond: nanosecond
    }

    sealed interface hour : TimeUnit<hour>
    sealed interface minute : TimeUnit<minute>
    sealed interface second : TimeUnit<second>
    sealed interface millisecond : TimeUnit<millisecond>
    sealed interface microsecond : TimeUnit<microsecond>
    sealed interface nanosecond : TimeUnit<nanosecond>
}
