// Automatically generated - do not modify!

package web.events

import kotlinx.js.JsPlainObject
import web.abort.AbortSignal
import web.abort.Abortable

@JsPlainObject
external interface AddEventListenerOptions :
    EventListenerOptions,
    Abortable {
    var once: Boolean?
    var passive: Boolean?
    override var signal: AbortSignal?
}
