// Automatically generated - do not modify!

package web.performance

import kotlin.js.definedExternally

/**
 * The **`PerformanceObserverEntryList`** interface is a list of PerformanceEntry that were explicitly observed via the PerformanceObserver.observe method.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PerformanceObserverEntryList)
 */
external class PerformanceObserverEntryList
private constructor() {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PerformanceObserverEntryList/getEntries)
     */
    fun getEntries(): PerformanceEntryList

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PerformanceObserverEntryList/getEntriesByName)
     */
    fun getEntriesByName(
        name: String,
        type: String = definedExternally,
    ): PerformanceEntryList

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PerformanceObserverEntryList/getEntriesByType)
     */
    fun getEntriesByType(type: String): PerformanceEntryList
}
