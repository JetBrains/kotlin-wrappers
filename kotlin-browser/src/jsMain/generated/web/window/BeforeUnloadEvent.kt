// Automatically generated - do not modify!

package web.window

import web.events.Event
import web.events.EventTarget

/**
 * The beforeunload event is fired when the window, the document and its resources are about to be unloaded.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/BeforeUnloadEvent)
 */
sealed external class BeforeUnloadEvent<out C : EventTarget?> : Event<C> {


    companion object : BeforeUnloadEventTypes
}
