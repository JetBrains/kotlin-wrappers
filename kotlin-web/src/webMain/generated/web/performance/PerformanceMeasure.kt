// Automatically generated - do not modify!

package web.performance

import kotlin.js.JsAny

/**
 * **`PerformanceMeasure`** is an _abstract_ interface for PerformanceEntry objects with an PerformanceEntry.entryType of `'measure'`.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PerformanceMeasure)
 */
open external class PerformanceMeasure
private constructor() :
    PerformanceEntry {
    /**
     * The read-only **`detail`** property returns arbitrary metadata that was included in the mark upon construction (when using Performance.measure.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PerformanceMeasure/detail)
     */
    val detail: JsAny?
}
