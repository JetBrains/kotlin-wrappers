// Automatically generated - do not modify!

@file:Suppress(
    "EXTERNAL_CLASS_CONSTRUCTOR_PROPERTY_PARAMETER",
)

package web.fonts

import js.core.ReadonlyArray
import web.events.Event
import web.events.EventInit
import web.events.EventType

external interface FontFaceSetLoadEventInit : EventInit {
    var fontfaces: ReadonlyArray<FontFace>?
}

open external class FontFaceSetLoadEvent(
    override val type: EventType<FontFaceSetLoadEvent>,
    init: FontFaceSetLoadEventInit = definedExternally,
) : Event {
    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/FontFaceSetLoadEvent/fontfaces) */
    val fontfaces: ReadonlyArray<FontFace>

    companion object
}
