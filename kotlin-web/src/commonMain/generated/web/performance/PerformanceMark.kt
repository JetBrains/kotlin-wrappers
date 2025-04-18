// Automatically generated - do not modify!

package web.performance

import js.core.JsAny
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
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PerformanceMark/detail)
     */
    val detail: JsAny?
}
