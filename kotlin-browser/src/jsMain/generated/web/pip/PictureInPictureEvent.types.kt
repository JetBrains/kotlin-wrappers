// Automatically generated - do not modify!

package web.pip

import seskar.js.JsValue
import seskar.js.JsVirtual
import web.events.EventTarget
import web.events.EventType

@JsVirtual
sealed external class PictureInPictureEventTypes :
    PictureInPictureEventTypes_deprecated {

    @JsValue("enterpictureinpicture")
    fun <C : EventTarget> enterPictureInPicture(): EventType<PictureInPictureEvent<C>>

    @JsValue("leavepictureinpicture")
    fun <C : EventTarget> leavePictureInPicture(): EventType<PictureInPictureEvent<C>>
}
