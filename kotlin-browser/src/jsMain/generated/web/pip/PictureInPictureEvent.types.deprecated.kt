// Automatically generated - do not modify!

package web.pip

import seskar.js.JsValue
import web.events.EventType

sealed external class PictureInPictureEventTypes_deprecated {

    @Deprecated(
        message = "Legacy event type declaration. Use type constant instead!",
        replaceWith = ReplaceWith("PictureInPictureEvent.ENTER_PICTURE_IN_PICTURE"),
    )
    @JsValue("enterpictureinpicture")
    fun enterPictureInPicture(): EventType<PictureInPictureEvent>

    @Deprecated(
        message = "Legacy event type declaration. Use type constant instead!",
        replaceWith = ReplaceWith("PictureInPictureEvent.LEAVE_PICTURE_IN_PICTURE"),
    )
    @JsValue("leavepictureinpicture")
    fun leavePictureInPicture(): EventType<PictureInPictureEvent>
}
