// Automatically generated - do not modify!

@file:Suppress(
    "EXTERNAL_CLASS_CONSTRUCTOR_PROPERTY_PARAMETER",
)

package web.pip

import seskar.js.JsAlias
import seskar.js.JsAlias.Companion.THIS
import web.events.Event
import web.events.EventTarget
import web.events.EventType

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PictureInPictureEvent)
 */
open external class PictureInPictureEvent(
    override val type: EventType<PictureInPictureEvent, EventTarget>,
    init: PictureInPictureEventInit,
) : Event {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PictureInPictureEvent/pictureInPictureWindow)
     */
    val pictureInPictureWindow: PictureInPictureWindow

    @JsAlias(THIS)
    override fun asInit(): PictureInPictureEventInit

    companion object : PictureInPictureEventTypes
}
