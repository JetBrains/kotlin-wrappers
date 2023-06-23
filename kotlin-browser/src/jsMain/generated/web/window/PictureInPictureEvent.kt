// Automatically generated - do not modify!

@file:Suppress(
    "EXTERNAL_CLASS_CONSTRUCTOR_PROPERTY_PARAMETER",
)

package web.window

import web.events.Event
import web.events.EventInit
import web.events.EventType

/** [MDN Reference](https://developer.mozilla.org/docs/Web/API/PictureInPictureEvent) */
external interface PictureInPictureEventInit : EventInit {
    var pictureInPictureWindow: PictureInPictureWindow
}

open external class PictureInPictureEvent(
    override val type: EventType<PictureInPictureEvent>,
    init: PictureInPictureEventInit,
) : Event {
    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/PictureInPictureEvent/pictureInPictureWindow) */
    val pictureInPictureWindow: PictureInPictureWindow

    companion object
}
