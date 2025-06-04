// Automatically generated - do not modify!

package web.viewport

import web.events.*

/**
 * The **`VisualViewport`** interface of the Visual Viewport API represents the visual viewport for a given window.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/VisualViewport)
 */
external class VisualViewport
private constructor() :
    EventTarget {
    /**
     * The **`height`** read-only property of the VisualViewport interface returns the height of the visual viewport, in CSS pixels, or `0` if current document is not fully active.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/VisualViewport/height)
     */
    val height: Double

    /**
     * The **`offsetLeft`** read-only property of the VisualViewport interface returns the offset of the left edge of the visual viewport from the left edge of the layout viewport in CSS pixels, or `0` if current document is not fully active.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/VisualViewport/offsetLeft)
     */
    val offsetLeft: Double

    /**
     * The **`offsetTop`** read-only property of the VisualViewport interface returns the offset of the top edge of the visual viewport from the top edge of the layout viewport in CSS pixels, or `0` if current document is not fully active.
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
     * The **`pageLeft`** read-only property of the VisualViewport interface returns the x coordinate of the left edge of the visual viewport relative to the initial containing block origin, in CSS pixels, or `0` if current document is not fully active.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/VisualViewport/pageLeft)
     */
    val pageLeft: Double

    /**
     * The **`pageTop`** read-only property of the VisualViewport interface returns the y coordinate of the top edge of the visual viewport relative to the initial containing block origin, in CSS pixels, or `0` if current document is not fully active.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/VisualViewport/pageTop)
     */
    val pageTop: Double

    /**
     * The **`scale`** read-only property of the VisualViewport interface returns the pinch-zoom scaling factor applied to the visual viewport, or `0` if current document is not fully active, or `1` if there is no output device.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/VisualViewport/scale)
     */
    val scale: Double

    /**
     * The **`width`** read-only property of the VisualViewport interface returns the width of the visual viewport, in CSS pixels, or `0` if current document is not fully active.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/VisualViewport/width)
     */
    val width: Double

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/VisualViewport/resize_event)
     */
    @JsEvent("resize")
    val resizeEvent: EventInstance<Event, VisualViewport /* this */, VisualViewport /* this */>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/VisualViewport/scroll_event)
     */
    @JsEvent("scroll")
    val scrollEvent: EventInstance<Event, VisualViewport /* this */, VisualViewport /* this */>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/VisualViewport/scrollend_event)
     */
    @JsEvent("scrollend")
    val scrollEndEvent: EventInstance<Event, VisualViewport /* this */, VisualViewport /* this */>
}
