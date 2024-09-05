// Automatically generated - do not modify!

package web.html

import web.dom.Node
import web.events.EventInstance
import web.pip.PictureInPictureEvent

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLVideoElement/enterpictureinpicture_event)
 */
inline val <C : HTMLVideoElement> C.enterPictureInPictureEvent: EventInstance<PictureInPictureEvent, C, Node>
    get() = EventInstance(this, PictureInPictureEvent.enterPictureInPicture())

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLVideoElement/leavepictureinpicture_event)
 */
inline val <C : HTMLVideoElement> C.leavePictureInPictureEvent: EventInstance<PictureInPictureEvent, C, Node>
    get() = EventInstance(this, PictureInPictureEvent.leavePictureInPicture())
