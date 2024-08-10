package web.abort.internal

import web.abort.AbortController
import web.abort.AbortSignal
import web.events.Event
import web.events.EventHandler
import web.events.addEventHandler

internal fun safeAny(
    signal1: AbortSignal?,
    signal2: AbortSignal,
): AbortSignal {
    if (signal1 == null)
        return signal2

    if (signal1.aborted)
        return signal1

    if (signal2.aborted)
        return signal2

    val controller = AbortController()
    val handlers = mutableListOf<() -> Unit>()
    val abortHandler = EventHandler<Event, AbortSignal, AbortSignal, _> { event ->
        handlers.forEach { it() }

        controller.abort(event.currentTarget.reason)
    }

    sequenceOf(signal1, signal2)
        .mapTo(handlers) { it.addEventHandler(Event.abort(), abortHandler) }

    return controller.signal
}
