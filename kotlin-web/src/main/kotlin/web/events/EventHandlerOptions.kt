@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.events

import kotlinx.js.jso
import web.abort.AbortSignal

@JsName("null") // IR workaround
sealed external interface EventHandlerOptions {
    var capture: Boolean?
    var once: Boolean?
    var passive: Boolean?
    var signal: AbortSignal?

    companion object
}

inline val EventHandlerOptions.Companion.ACTIVE: EventHandlerOptions
    get() = jso {
        passive = false
    }

inline val EventHandlerOptions.Companion.CAPTURE: EventHandlerOptions
    get() = jso {
        capture = true
    }
