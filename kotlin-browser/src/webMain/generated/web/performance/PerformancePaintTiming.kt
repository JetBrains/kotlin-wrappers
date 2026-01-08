// Automatically generated - do not modify!

package web.performance

import kotlin.js.JsAny

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
     * The **`toJSON()`** method of the PerformancePaintTiming interface is a serializer; it returns a JSON representation of the PerformancePaintTiming object.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PerformancePaintTiming/toJSON)
     */
    override fun toJSON(): JsAny
}
