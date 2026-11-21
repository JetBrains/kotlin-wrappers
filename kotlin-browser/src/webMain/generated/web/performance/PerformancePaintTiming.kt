// Automatically generated - do not modify!

package web.performance

import web.time.DOMHighResTimeStamp

/**
 * The **`PerformancePaintTiming`** interface provides timing information about "paint" (also called "render") operations during web page construction. "Paint" refers to conversion of the render tree to on-screen pixels.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PerformancePaintTiming)
 */
open external class PerformancePaintTiming
private constructor() :
    PerformanceEntry,
    PaintTimingMixin {
    /**
     * The **`toJSON()`** method of the PerformancePaintTiming interface returns a JSON-serializable plain object representing the PerformancePaintTiming object.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PerformancePaintTiming/toJSON)
     */
    override fun toJSON(): JsAny

    /* `PaintTimingMixin` overrides */

    override val paintTime: DOMHighResTimeStamp
    override val presentationTime: DOMHighResTimeStamp?
}
