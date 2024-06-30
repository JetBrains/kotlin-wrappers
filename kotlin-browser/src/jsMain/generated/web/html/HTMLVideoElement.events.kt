// Automatically generated - do not modify!

package web.html

import web.dom.Node
import web.events.EventInstance
import web.events.EventType
import web.pip.PictureInPictureEvent

inline val <C : HTMLVideoElement> C.enterPictureInPictureEvent: EventInstance<PictureInPictureEvent, C, Node>
    get() = EventInstance(this, EventType("enterpictureinpicture"))

inline val <C : HTMLVideoElement> C.leavePictureInPictureEvent: EventInstance<PictureInPictureEvent, C, Node>
    get() = EventInstance(this, EventType("leavepictureinpicture"))
