// Automatically generated - do not modify!

package web.pip

import js.reflect.unsafeCast
import web.events.Event
import web.events.EventType

/**
 * The **`PictureInPictureEvent`** interface represents picture-in-picture-related events, including HTMLVideoElement/enterpictureinpicture_event, HTMLVideoElement/leavepictureinpicture_event and PictureInPictureWindow/resize_event.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PictureInPictureEvent)
 */
open external class PictureInPictureEvent(
    override val type: EventType<PictureInPictureEvent>,
    init: PictureInPictureEventInit,
) : Event {
    /**
     * The read-only **`pictureInPictureWindow`** property of the PictureInPictureEvent interface returns the PictureInPictureWindow the event relates to.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PictureInPictureEvent/pictureInPictureWindow)
     */
    val pictureInPictureWindow: PictureInPictureWindow

    companion object
}

inline fun PictureInPictureEvent.asInit(): PictureInPictureEventInit =
    unsafeCast(this)

inline val PictureInPictureEvent.Companion.ENTER_PICTURE_IN_PICTURE: EventType<PictureInPictureEvent>
    get() = EventType("enterpictureinpicture")

inline val PictureInPictureEvent.Companion.LEAVE_PICTURE_IN_PICTURE: EventType<PictureInPictureEvent>
    get() = EventType("leavepictureinpicture")
