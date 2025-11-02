// Automatically generated - do not modify!

package web.performance

import kotlin.js.JsAny

/**
 * **`PerformanceMeasure`** is an abstract interface for PerformanceEntry objects with an entryType of "measure". Entries of this type are created by calling performance.measure() to add a named DOMHighResTimeStamp (the measure) between two marks to the browser's performance timeline.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PerformanceMeasure)
 */
open external class PerformanceMeasure
private constructor() :
    PerformanceEntry {
    /**
     * The read-only **`detail`** property returns arbitrary metadata that was included in the mark upon construction (when using performance.measure().
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PerformanceMeasure/detail)
     */
    val detail: JsAny?
}
