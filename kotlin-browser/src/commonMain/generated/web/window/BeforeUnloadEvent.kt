// Automatically generated - do not modify!

package web.window

import seskar.js.JsValue
import web.events.Event
import web.events.EventType

/**
 * The **`BeforeUnloadEvent`** interface represents the event object for the Window/beforeunload_event event, which is fired when the current window, contained document, and associated resources are about to be unloaded.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/BeforeUnloadEvent)
 */
external class BeforeUnloadEvent
private constructor() :
    Event {


    companion object {
        @JsValue("beforeunload")
        val BEFORE_UNLOAD: EventType<BeforeUnloadEvent>
    }
}
