// Automatically generated - do not modify!

package web.events

import web.abort.AbortSignal
import web.abort.Abortable

sealed external interface AddEventListenerOptions :
    EventListenerOptions,
    Abortable {
    var once: Boolean?
    var passive: Boolean?
    override var signal: AbortSignal?
}
