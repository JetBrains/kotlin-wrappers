@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.events

import js.core.jso
import web.abort.AbortSignal

@JsName("null") // IR workaround
sealed external interface AddEventListenerOptions {
    var capture: Boolean?
    var once: Boolean?
    var passive: Boolean?
    var signal: AbortSignal?

    companion object
}

inline val AddEventListenerOptions.Companion.ACTIVE: AddEventListenerOptions
    get() = jso {
        passive = false
    }

inline val AddEventListenerOptions.Companion.CAPTURE: AddEventListenerOptions
    get() = jso {
        capture = true
    }
