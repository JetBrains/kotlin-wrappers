// Automatically generated - do not modify!

package web.performance

import web.dom.Element
import web.time.DOMHighResTimeStamp

/**
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
    override fun toJSON(): Any
}
