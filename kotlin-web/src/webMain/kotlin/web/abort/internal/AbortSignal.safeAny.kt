package web.abort.internal

import js.array.jsArrayOf
import js.errors.toJsError
import js.reflect.Reflect
import web.abort.AbortController
import web.abort.AbortSignal
import web.abort.abortEvent
import web.events.Event
import web.events.EventHandler
import web.events.addHandler

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

    return if (Reflect.has(AbortSignal, "any")) {
        AbortSignal.any(jsArrayOf(signal1, signal2))
    } else {
        legacySafariAny(signal1, signal2)
    }
}

private fun legacySafariAny(
    signal1: AbortSignal,
    signal2: AbortSignal,
): AbortSignal {
    val controller = AbortController()
    val handlers = mutableListOf<() -> Unit>()
    val abortHandler = EventHandler<Event, AbortSignal, AbortSignal, _> { event ->
        handlers.forEach { it() }

        controller.abort(event.currentTarget.reason?.toJsError())
    }

    handlers += signal1.abortEvent.addHandler(abortHandler)
    handlers += signal2.abortEvent.addHandler(abortHandler)

    return controller.signal
}
