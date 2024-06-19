// Automatically generated - do not modify!

package web.pip

import seskar.js.JsValue
import web.events.EventTarget
import web.events.EventType

sealed external class PictureInPictureEventTypes {

    @JsValue("enterpictureinpicture")
    fun <C : EventTarget> enterPictureInPicture(): EventType<PictureInPictureEvent, C>

    @JsValue("leavepictureinpicture")
    fun <C : EventTarget> leavePictureInPicture(): EventType<PictureInPictureEvent, C>
}
