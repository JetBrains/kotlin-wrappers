// Automatically generated - do not modify!

package web.events

import web.abort.AbortSignal

sealed external interface AddEventListenerOptions :
    EventListenerOptions {
    var once: Boolean?
    var passive: Boolean?
    var signal: AbortSignal?
}
