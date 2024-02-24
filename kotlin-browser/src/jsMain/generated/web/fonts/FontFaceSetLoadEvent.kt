// Automatically generated - do not modify!

@file:Suppress(
    "EXTERNAL_CLASS_CONSTRUCTOR_PROPERTY_PARAMETER",
)

package web.fonts

import js.array.ReadonlyArray
import web.events.Event
import web.events.EventTarget
import web.events.EventType

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/FontFaceSetLoadEvent)
 */
open external class FontFaceSetLoadEvent<out C : EventTarget?>(
    override val type: EventType<FontFaceSetLoadEvent<*>>,
    init: FontFaceSetLoadEventInit = definedExternally,
) : Event<C>,
    FontFaceSetLoadEventInit {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/FontFaceSetLoadEvent/fontfaces)
     */
    override val fontfaces: ReadonlyArray<FontFace>

    companion object : FontFaceSetLoadEventTypes
}
