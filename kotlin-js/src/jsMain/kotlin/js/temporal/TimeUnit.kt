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
        val hour: TimeUnit

        @JsValue("minute")
        val minute: TimeUnit

        @JsValue("second")
        val second: TimeUnit

        @JsValue("millisecond")
        val millisecond: TimeUnit

        @JsValue("microsecond")
        val microsecond: TimeUnit

        @JsValue("nanosecond")
        val nanosecond: TimeUnit
    }
}
