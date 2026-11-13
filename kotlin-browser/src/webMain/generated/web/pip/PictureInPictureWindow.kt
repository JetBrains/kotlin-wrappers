// Automatically generated - do not modify!

package web.pip

import web.events.Event
import web.events.EventHandler
import web.events.EventInstance
import web.events.EventTarget

/**
 * The **`PictureInPictureWindow`** interface represents an object able to programmatically obtain the width and height and resize event of the floating video window.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PictureInPictureWindow)
 */
open external class PictureInPictureWindow
private constructor() :
    EventTarget {
    /**
     * The **`height`** read-only property of the PictureInPictureWindow interface returns the height of the floating video window in pixels.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PictureInPictureWindow/height)
     */
    open val height: Int

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PictureInPictureWindow/resize_event)
     */
    open var onresize: EventHandler<Event, PictureInPictureWindow, PictureInPictureWindow>?

    /**
     * The **`width`** read-only property of the PictureInPictureWindow interface returns the width of the floating video window in pixels.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PictureInPictureWindow/width)
     */
    open val width: Int
}

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PictureInPictureWindow/resize_event)
 */
inline val <C : PictureInPictureWindow> C.resizeEvent: EventInstance<Event, C, C>
    get() = EventInstance(this, "resize")
