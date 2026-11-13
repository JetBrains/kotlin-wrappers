// Automatically generated - do not modify!

package web.performance

import web.dom.Element
import web.time.DOMHighResTimeStamp

/**
 * The **`LargestContentfulPaint`** interface provides timing information about the largest image or text paint before user input on a web page.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/LargestContentfulPaint)
 */
open external class LargestContentfulPaint
private constructor() :
    PerformanceEntry,
    PaintTimingMixin {
    /**
     * The **`element`** read-only property of the LargestContentfulPaint interface returns an object representing the Element that is the largest contentful paint.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/LargestContentfulPaint/element)
     */
    open val element: Element?

    /**
     * The **`id`** read-only property of the LargestContentfulPaint interface returns the ID of the element that is the largest contentful paint.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/LargestContentfulPaint/id)
     */
    open val id: String

    /**
     * The **`loadTime`** read-only property of the LargestContentfulPaint interface returns the time that the element was loaded.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/LargestContentfulPaint/loadTime)
     */
    open val loadTime: DOMHighResTimeStamp

    /**
     * The **`renderTime`** read-only property of the LargestContentfulPaint interface represents the time that the element was rendered to the screen.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/LargestContentfulPaint/renderTime)
     */
    open val renderTime: DOMHighResTimeStamp

    /**
     * The **`size`** read-only property of the LargestContentfulPaint interface returns the intrinsic size of the element that is the largest contentful paint.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/LargestContentfulPaint/size)
     */
    open val size: Int

    /**
     * The **`url`** read-only property of the LargestContentfulPaint interface returns the request URL of the element, if the element is an image.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/LargestContentfulPaint/url)
     */
    open val url: String

    /**
     * The **`toJSON()`** method of the LargestContentfulPaint interface returns a JSON-serializable plain object representing the LargestContentfulPaint object.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/LargestContentfulPaint/toJSON)
     */
    override fun toJSON(): JsAny
}
