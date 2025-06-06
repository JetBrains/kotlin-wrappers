// Automatically generated - do not modify!

package web.clipboard

import seskar.js.JsAlias
import seskar.js.JsAlias.Companion.THIS
import seskar.js.JsValue
import web.data.DataTransfer
import web.events.Event
import web.events.EventType
import kotlin.js.definedExternally

/**
 * The **`ClipboardEvent`** interface of the Clipboard API represents events providing information related to modification of the clipboard, that is Element/cut_event, Element/copy_event, and Element/paste_event events.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ClipboardEvent)
 */
open external class ClipboardEvent(
    override val type: EventType<ClipboardEvent>,
    init: ClipboardEventInit = definedExternally,
) : Event {
    /**
     * The **`clipboardData`** property of the ClipboardEvent interface holds a DataTransfer object, which can be used to: - specify what data should be put into the clipboard from the Element/cut_event and Element/copy_event event handlers, typically with a DataTransfer.setData call; - obtain the data to be pasted from the Element/paste_event event handler, typically with a DataTransfer.getData call.
     *
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
