// Automatically generated - do not modify!

@file:Suppress(
    "EXTERNAL_CLASS_CONSTRUCTOR_PROPERTY_PARAMETER",
)

package web.pip

import web.events.Event
import web.events.EventTarget
import web.events.EventType

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PictureInPictureEvent)
 */
open external class PictureInPictureEvent<out C : EventTarget?>(
    override val type: EventType<PictureInPictureEvent<EventTarget>>,
    init: PictureInPictureEventInit,
) : Event<C>,
    PictureInPictureEventInit {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PictureInPictureEvent/pictureInPictureWindow)
     */
    override val pictureInPictureWindow: PictureInPictureWindow

    companion object : PictureInPictureEventTypes
}
