// Automatically generated - do not modify!

package web.viewport

import web.events.*

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/VisualViewport)
 */
sealed external class VisualViewport :
    EventTarget {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/VisualViewport/height)
     */
    val height: Double

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/VisualViewport/offsetLeft)
     */
    val offsetLeft: Double

    /**
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
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/VisualViewport/pageLeft)
     */
    val pageLeft: Double

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/VisualViewport/pageTop)
     */
    val pageTop: Double

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/VisualViewport/scale)
     */
    val scale: Double

    /**
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
