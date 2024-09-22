// Automatically generated - do not modify!

@file:Suppress(
    "EXTERNAL_CLASS_CONSTRUCTOR_PROPERTY_PARAMETER",
)

package web.clipboard

import seskar.js.JsAlias
import seskar.js.JsAlias.Companion.THIS
import seskar.js.JsValue
import web.data.DataTransfer
import web.events.Event
import web.events.EventType

/**
 * Events providing information related to modification of the clipboard, that is cut, copy, and paste events.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ClipboardEvent)
 */
open external class ClipboardEvent(
    override val type: EventType<ClipboardEvent>,
    init: ClipboardEventInit = definedExternally,
) : Event {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ClipboardEvent/clipboardData)
     */
    val clipboardData: DataTransfer?

    @JsAlias(THIS)
    override fun asInit(): ClipboardEventInit

    companion object {
        @JsValue("copy")
        val COPY: EventType<ClipboardEvent>

        @JsValue("cut")
        val CUT: EventType<ClipboardEvent>

        @JsValue("paste")
        val PASTE: EventType<ClipboardEvent>
    }
}
