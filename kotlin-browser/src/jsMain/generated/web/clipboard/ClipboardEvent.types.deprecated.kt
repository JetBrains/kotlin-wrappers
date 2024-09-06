// Automatically generated - do not modify!

package web.clipboard

import seskar.js.JsValue
import web.events.EventType

sealed external class ClipboardEventTypes_deprecated {

    @JsValue("copy")
    fun copy(): EventType<ClipboardEvent>

    @JsValue("cut")
    fun cut(): EventType<ClipboardEvent>

    @JsValue("paste")
    fun paste(): EventType<ClipboardEvent>
}
