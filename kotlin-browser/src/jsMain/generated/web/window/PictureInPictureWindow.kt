// Automatically generated - do not modify!

package web.window

import web.events.Event
import web.events.EventHandler
import web.events.EventTarget

sealed external class PictureInPictureWindow :
    EventTarget {
    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/PictureInPictureWindow/height) */
    val height: Double

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/PictureInPictureWindow/resize_event) */
    var onresize: EventHandler<Event>?

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/PictureInPictureWindow/width) */
    val width: Double
}
