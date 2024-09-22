// Automatically generated - do not modify!

package web.window

import seskar.js.JsValue
import web.events.Event
import web.events.EventType

/**
 * The beforeunload event is fired when the window, the document and its resources are about to be unloaded.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/BeforeUnloadEvent)
 */
sealed external class BeforeUnloadEvent : Event {


    companion object {
        @JsValue("beforeunload")
        val BEFORE_UNLOAD: EventType<BeforeUnloadEvent>
    }
}
