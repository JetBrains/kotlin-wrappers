// Automatically generated - do not modify!

@file:Suppress(
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
)

package web.pip

import seskar.js.JsValue
import web.events.EventType

sealed external interface PictureInPictureEventTypes {
    @JsValue("enterpictureinpicture")
    val ENTER_PICTURE_IN_PICTURE: EventType<PictureInPictureEvent<*>>
        get() = definedExternally

    @JsValue("leavepictureinpicture")
    val LEAVE_PICTURE_IN_PICTURE: EventType<PictureInPictureEvent<*>>
        get() = definedExternally
}
