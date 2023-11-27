package web.events

import web.abort.AbortSignal

sealed external interface EventListenerOptions {
    var capture: Boolean?
}

sealed external interface AddEventListenerOptions :
    EventListenerOptions {
    var once: Boolean?
    var passive: Boolean?
    var signal: AbortSignal?
}
