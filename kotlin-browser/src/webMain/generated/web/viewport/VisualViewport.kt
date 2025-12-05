// Automatically generated - do not modify!

package web.viewport

import web.events.Event
import web.events.EventHandler
import web.events.EventInstance
import web.events.EventTarget

/**
 * The **`VisualViewport`** interface of the CSSOM view API represents the visual viewport for a given window. For a page containing iframes, each iframe, as well as the containing page, will have a unique window object. Each window on a page will have a unique VisualViewport representing the properties associated with that window.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/VisualViewport)
 */
open external class VisualViewport
private constructor() :
    EventTarget {
    /**
     * The **`height`** read-only property of the VisualViewport interface returns the height of the visual viewport, in CSS pixels, or 0 if current document is not fully active.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/VisualViewport/height)
     */
    val height: Double

    /**
     * The **`offsetLeft`** read-only property of the VisualViewport interface returns the offset of the left edge of the visual viewport from the left edge of the layout viewport in CSS pixels, or 0 if current document is not fully active.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/VisualViewport/offsetLeft)
     */
    val offsetLeft: Double

    /**
     * The **`offsetTop`** read-only property of the VisualViewport interface returns the offset of the top edge of the visual viewport from the top edge of the layout viewport in CSS pixels, or 0 if current document is not fully active.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/VisualViewport/offsetTop)
     */
    val offsetTop: Double

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/VisualViewport/resize_event)
     */
    var onresize: EventHandler<Event, VisualViewport, VisualViewport>?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/VisualViewport/scroll_event)
     */
    var onscroll: EventHandler<Event, VisualViewport, VisualViewport>?

    /**
     * The **`pageLeft`** read-only property of the VisualViewport interface returns the x coordinate of the left edge of the visual viewport relative to the initial containing block origin, in CSS pixels, or 0 if current document is not fully active.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/VisualViewport/pageLeft)
     */
    val pageLeft: Double

    /**
     * The **`pageTop`** read-only property of the VisualViewport interface returns the y coordinate of the top edge of the visual viewport relative to the initial containing block origin, in CSS pixels, or 0 if current document is not fully active.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/VisualViewport/pageTop)
     */
    val pageTop: Double

    /**
     * The **`scale`** read-only property of the VisualViewport interface returns the pinch-zoom scaling factor applied to the visual viewport, or 0 if current document is not fully active, or 1 if there is no output device.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/VisualViewport/scale)
     */
    val scale: Double

    /**
     * The **`width`** read-only property of the VisualViewport interface returns the width of the visual viewport, in CSS pixels, or 0 if current document is not fully active.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/VisualViewport/width)
     */
    val width: Double
}

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/VisualViewport/resize_event)
 */
inline val <C : VisualViewport> C.resizeEvent: EventInstance<Event, C, C>
    get() = EventInstance(this, "resize")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/VisualViewport/scroll_event)
 */
inline val <C : VisualViewport> C.scrollEvent: EventInstance<Event, C, C>
    get() = EventInstance(this, "scroll")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/VisualViewport/scrollend_event)
 */
inline val <C : VisualViewport> C.scrollEndEvent: EventInstance<Event, C, C>
    get() = EventInstance(this, "scrollend")
