package web.abort.internal

import js.errors.toJsError
import js.internal.InternalApi
import web.abort.AbortController
import web.abort.AbortSignal
import web.events.ABORT
import web.events.Event
import web.events.EventHandler
import web.events.addEventHandler

@InternalApi
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

        controller.abort(event.currentTarget.reason?.toJsError())
    }

    sequenceOf(signal1, signal2)
        .mapTo(handlers) { it.addEventHandler(Event.ABORT, abortHandler) }

    return controller.signal
}
