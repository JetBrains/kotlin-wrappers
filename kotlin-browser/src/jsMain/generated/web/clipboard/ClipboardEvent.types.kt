// Automatically generated - do not modify!

package web.clipboard

import seskar.js.JsValue
import web.events.EventType

sealed external class ClipboardEventTypes {

    @JsValue("copy")
    val COPY: EventType<ClipboardEvent>

    @JsValue("cut")
    val CUT: EventType<ClipboardEvent>

    @JsValue("paste")
    val PASTE: EventType<ClipboardEvent>
}
