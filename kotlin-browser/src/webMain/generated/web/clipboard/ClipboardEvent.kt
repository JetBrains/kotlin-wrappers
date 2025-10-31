// Automatically generated - do not modify!

package web.clipboard

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
     * The **`clipboardData`** property of the ClipboardEvent interface holds a DataTransfer object, which can be used to:
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ClipboardEvent/clipboardData)
     */
    val clipboardData: DataTransfer?

    companion object
}

inline val ClipboardEvent.Companion.COPY: EventType<ClipboardEvent>
    get() = EventType("copy")

inline val ClipboardEvent.Companion.CUT: EventType<ClipboardEvent>
    get() = EventType("cut")

inline val ClipboardEvent.Companion.PASTE: EventType<ClipboardEvent>
    get() = EventType("paste")
