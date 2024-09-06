// Automatically generated - do not modify!

package web.pip

import seskar.js.JsValue
import web.events.EventType

sealed external class PictureInPictureEventTypes {

    @JsValue("enterpictureinpicture")
    fun enterPictureInPicture(): EventType<PictureInPictureEvent>

    @JsValue("leavepictureinpicture")
    fun leavePictureInPicture(): EventType<PictureInPictureEvent>
}
