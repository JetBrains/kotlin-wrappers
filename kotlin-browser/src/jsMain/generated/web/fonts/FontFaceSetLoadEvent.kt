// Automatically generated - do not modify!

@file:Suppress(
    "EXTERNAL_CLASS_CONSTRUCTOR_PROPERTY_PARAMETER",
)

package web.fonts

import js.array.ReadonlyArray
import seskar.js.JsAlias
import seskar.js.JsAlias.Companion.THIS
import web.events.Event
import web.events.EventType

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/FontFaceSetLoadEvent)
 */
open external class FontFaceSetLoadEvent(
    override val type: EventType<FontFaceSetLoadEvent>,
    init: FontFaceSetLoadEventInit = definedExternally,
) : Event {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/FontFaceSetLoadEvent/fontfaces)
     */
    val fontfaces: ReadonlyArray<FontFace>

    @JsAlias(THIS)
    override fun asInit(): FontFaceSetLoadEventInit

    companion object : FontFaceSetLoadEventTypes
}
