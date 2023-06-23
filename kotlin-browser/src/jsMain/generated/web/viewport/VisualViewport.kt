// Automatically generated - do not modify!

package web.viewport

import web.events.Event
import web.events.EventHandler
import web.events.EventTarget

/** [MDN Reference](https://developer.mozilla.org/docs/Web/API/VisualViewport) */
sealed external class VisualViewport :
    EventTarget {
    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/VisualViewport/height) */
    val height: Double

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/VisualViewport/offsetLeft) */
    val offsetLeft: Int

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/VisualViewport/offsetTop) */
    val offsetTop: Int

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/VisualViewport/resize_event) */
    var onresize: EventHandler<Event>?

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/VisualViewport/scroll_event) */
    var onscroll: EventHandler<Event>?

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/VisualViewport/pageLeft) */
    val pageLeft: Double

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/VisualViewport/pageTop) */
    val pageTop: Double

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/VisualViewport/scale) */
    val scale: Double

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/VisualViewport/width) */
    val width: Double
}
