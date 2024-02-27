// Automatically generated - do not modify!

package web.clipboard

import seskar.js.JsValue
import seskar.js.JsVirtual
import web.events.EventTarget
import web.events.EventType

@JsVirtual
sealed external class ClipboardEventTypes :
    ClipboardEventTypes_deprecated {

    @JsValue("copy")
    fun <C : EventTarget> copy(): EventType<ClipboardEvent<C>>

    @JsValue("cut")
    fun <C : EventTarget> cut(): EventType<ClipboardEvent<C>>

    @JsValue("paste")
    fun <C : EventTarget> paste(): EventType<ClipboardEvent<C>>
}
