@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.events

import kotlinx.js.jso
import web.abort.AbortSignal

typealias EventTarget = org.w3c.dom.events.EventTarget

@JsName("null") // IR workaround
sealed external interface EventHandlerOptions {
    var capture: Boolean?
    var once: Boolean?
    var passive: Boolean?
    var signal: AbortSignal?

    companion object
}

inline val EventHandlerOptions.Companion.ACTIVE: EventHandlerOptions
    get() = jso { passive = false }

inline val EventHandlerOptions.Companion.CAPTURE: EventHandlerOptions
    get() = jso { capture = true }

fun <T : Event> EventTarget.addEventHandler(
    type: EventType<T>,
    handler: (T) -> Unit,
): () -> Unit =
    addEventHandler(
        type = type,
        handler = handler,
        options = undefined,
    )

fun <T : Event> EventTarget.addEventHandler(
    type: EventType<T>,
    options: EventHandlerOptions?,
    handler: (T) -> Unit,
): () -> Unit {
    addEventListener(
        type = type.unsafeCast<String>(),
        callback = handler.unsafeCast<(Event) -> Unit>(),
        options = options,
    )

    return {
        removeEventListener(
            type = type.unsafeCast<String>(),
            callback = handler.unsafeCast<(Event) -> Unit>(),
            options = options,
        )
    }
}
