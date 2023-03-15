package web.abort

import js.core.ReadonlyArray
import web.events.Event
import web.events.EventHandler

fun AbortSignal.Companion.any(signals: ReadonlyArray<AbortSignal>): AbortSignal {
    val controller = AbortController()

    var onAbortHandler: EventHandler<Event>? = null

    val onAbort = {
        controller.abort()

        // Cleanup
        for (signal in signals) {
            signal.removeEventListener(Event.ABORT, onAbortHandler)
        }
    }

    onAbortHandler = { onAbort() }

    for (signal in signals) {
        if (signal.aborted) {
            onAbort.invoke()
            break
        }

        signal.addEventListener(Event.ABORT, onAbortHandler)
    }

    return controller.signal
}
