// Automatically generated - do not modify!

package web.performance

import js.core.JsAny
import web.dom.Element
import web.time.DOMHighResTimeStamp

/**
 * The `LargestContentfulPaint` interface provides timing information about the largest image or text paint before user input on a web page.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/LargestContentfulPaint)
 */
external class LargestContentfulPaint
private constructor() :
    PerformanceEntry {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/LargestContentfulPaint/element)
     */
    val element: Element?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/LargestContentfulPaint/id)
     */
    val id: String

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/LargestContentfulPaint/loadTime)
     */
    val loadTime: DOMHighResTimeStamp

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/LargestContentfulPaint/renderTime)
     */
    val renderTime: DOMHighResTimeStamp

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/LargestContentfulPaint/size)
     */
    val size: Int

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/LargestContentfulPaint/url)
     */
    val url: String

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/LargestContentfulPaint/toJSON)
     */
    override fun toJSON(): JsAny
}
