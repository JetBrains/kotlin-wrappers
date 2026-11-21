// Automatically generated - do not modify!

package web.performance

import js.reflect.unsafeCast
import js.union.JsUnion

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PerformanceEntry/entryType)
 */
@JsUnion
sealed /* union */
external interface PerformanceEntryType<out T : PerformanceEntry>

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PerformanceEntry/entryType#measure)
 */
inline val PerformanceEntryType.Companion.measure: PerformanceEntryType<PerformanceMeasure>
    get() = unsafeCast("measure")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PerformanceEntry/entryType#resource)
 */
inline val PerformanceEntryType.Companion.resource: PerformanceEntryType<PerformanceResourceTiming>
    get() = unsafeCast("resource")
