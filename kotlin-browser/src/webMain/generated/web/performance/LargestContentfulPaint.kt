// Automatically generated - do not modify!

package web.performance

import web.dom.Element
import web.time.DOMHighResTimeStamp
import kotlin.js.JsAny

/**
 * The **`LargestContentfulPaint`** interface provides timing information about the largest image or text paint before user input on a web page.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/LargestContentfulPaint)
 */
open external class LargestContentfulPaint
private constructor() :
    PerformanceEntry {
    /**
     * The **`element`** read-only property of the LargestContentfulPaint interface returns an object representing the Element that is the largest contentful paint.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/LargestContentfulPaint/element)
     */
    val element: Element?

    /**
     * The **`id`** read-only property of the LargestContentfulPaint interface returns the ID of the element that is the largest contentful paint.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/LargestContentfulPaint/id)
     */
    val id: String

    /**
     * The **`loadTime`** read-only property of the LargestContentfulPaint interface returns the time that the element was loaded.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/LargestContentfulPaint/loadTime)
     */
    val loadTime: DOMHighResTimeStamp

    /**
     * The **`renderTime`** read-only property of the LargestContentfulPaint interface represents the time that the element was rendered to the screen.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/LargestContentfulPaint/renderTime)
     */
    val renderTime: DOMHighResTimeStamp

    /**
     * The **`size`** read-only property of the LargestContentfulPaint interface returns the intrinsic size of the element that is the largest contentful paint.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/LargestContentfulPaint/size)
     */
    val size: Int

    /**
     * The **`url`** read-only property of the LargestContentfulPaint interface returns the request URL of the element, if the element is an image.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/LargestContentfulPaint/url)
     */
    val url: String

    /**
     * The **`toJSON()`** method of the LargestContentfulPaint interface is a serializer; it returns a JSON representation of the LargestContentfulPaint object.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/LargestContentfulPaint/toJSON)
     */
    override fun toJSON(): JsAny
}
