// Automatically generated - do not modify!

package web.pip

import web.events.*

/**
 * The **`PictureInPictureWindow`** interface represents an object able to programmatically obtain the **`width`** and **`height`** and **`resize event`** of the floating video window.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PictureInPictureWindow)
 */
external class PictureInPictureWindow
private constructor() :
    EventTarget {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PictureInPictureWindow/height)
     */
    val height: Int

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PictureInPictureWindow/resize_event)
     */
    var onresize: EventHandler<Event, PictureInPictureWindow, PictureInPictureWindow>?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PictureInPictureWindow/width)
     */
    val width: Int

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PictureInPictureWindow/resize_event)
     */
    @JsEvent("resize")
    val resizeEvent: EventInstance<Event, PictureInPictureWindow /* this */, PictureInPictureWindow /* this */>
}
