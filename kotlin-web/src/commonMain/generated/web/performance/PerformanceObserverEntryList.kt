// Automatically generated - do not modify!

package web.performance

import kotlin.js.definedExternally

/**
 * The **`PerformanceObserverEntryList`** interface is a list of PerformanceEntry that were explicitly observed via the PerformanceObserver.observe method.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PerformanceObserverEntryList)
 */
open external class PerformanceObserverEntryList
private constructor() {
    /**
     * The **`getEntries()`** method of the PerformanceObserverEntryList interface returns a list of explicitly observed PerformanceEntry objects.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PerformanceObserverEntryList/getEntries)
     */
    fun getEntries(): PerformanceEntryList

    /**
     * The **`getEntriesByName()`** method of the PerformanceObserverEntryList interface returns a list of explicitly observed PerformanceEntry objects for a given PerformanceEntry.name and PerformanceEntry.entryType.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PerformanceObserverEntryList/getEntriesByName)
     */
    fun getEntriesByName(
        name: String,
        type: String = definedExternally,
    ): PerformanceEntryList

    /**
     * The **`getEntriesByType()`** method of the PerformanceObserverEntryList returns a list of explicitly _observed_ PerformanceEntry objects for a given PerformanceEntry.entryType.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PerformanceObserverEntryList/getEntriesByType)
     */
    fun getEntriesByType(type: String): PerformanceEntryList
}
