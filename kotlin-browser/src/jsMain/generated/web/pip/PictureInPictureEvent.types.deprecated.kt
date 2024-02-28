// Automatically generated - do not modify!

@file:Suppress(
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
)

package web.pip

import seskar.js.JsValue
import web.events.EventTarget
import web.events.EventType

sealed external interface PictureInPictureEventTypes_deprecated {
    @Deprecated(
        message = "Legacy type declaration. Use type function instead!",
        replaceWith = ReplaceWith("PictureInPictureEvent.enterPictureInPicture()"),
    )
    @JsValue("enterpictureinpicture")
    val ENTER_PICTURE_IN_PICTURE: EventType<PictureInPictureEvent<EventTarget>>
        get() = definedExternally

    @Deprecated(
        message = "Legacy type declaration. Use type function instead!",
        replaceWith = ReplaceWith("PictureInPictureEvent.leavePictureInPicture()"),
    )
    @JsValue("leavepictureinpicture")
    val LEAVE_PICTURE_IN_PICTURE: EventType<PictureInPictureEvent<EventTarget>>
        get() = definedExternally
}
