// Automatically generated - do not modify!

package web.performance

import kotlin.js.JsAny
import kotlin.js.definedExternally

/**
 * **`PerformanceMark`** is an interface for PerformanceEntry objects with an PerformanceEntry.entryType of `'mark'`.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PerformanceMark)
 */
open external class PerformanceMark(
    markName: String,
    markOptions: PerformanceMarkOptions = definedExternally,
) : PerformanceEntry {
    /**
     * The read-only **`detail`** property returns arbitrary metadata that was included in the mark upon construction (either when using Performance.mark or the PerformanceMark.PerformanceMark constructor).
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PerformanceMark/detail)
     */
    val detail: JsAny?
}
