@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package js.temporal

import seskar.js.JsValue
import seskar.js.JsVirtual

@JsVirtual
sealed external interface TimeUnit :
    DateTimeUnit {
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

    sealed interface hour : TimeUnit
    sealed interface minute : TimeUnit
    sealed interface second : TimeUnit
    sealed interface millisecond : TimeUnit
    sealed interface microsecond : TimeUnit
    sealed interface nanosecond : TimeUnit
}
