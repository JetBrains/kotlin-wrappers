// Automatically generated - do not modify!

package web.clipboard

import org.w3c.dom.clipboard.ClipboardEvent
import web.events.EventType

inline val ClipboardEvent.Companion.COPY: EventType<ClipboardEvent>
    get() = EventType("copy")

inline val ClipboardEvent.Companion.CUT: EventType<ClipboardEvent>
    get() = EventType("cut")

inline val ClipboardEvent.Companion.PASTE: EventType<ClipboardEvent>
    get() = EventType("paste")
