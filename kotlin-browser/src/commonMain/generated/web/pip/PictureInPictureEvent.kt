// Automatically generated - do not modify!

package web.pip

import seskar.js.JsAlias
import seskar.js.JsAlias.Companion.THIS
import seskar.js.JsValue
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

    @JsAlias(THIS)
    override fun asInit(): PictureInPictureEventInit

    companion object {
        @JsValue("enterpictureinpicture")
        val ENTER_PICTURE_IN_PICTURE: EventType<PictureInPictureEvent>

        @JsValue("leavepictureinpicture")
        val LEAVE_PICTURE_IN_PICTURE: EventType<PictureInPictureEvent>
    }
}
